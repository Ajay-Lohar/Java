package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class CourseController {
    CourseService courseService;

    @GetMapping("/courses/createForm")
    public ModelAndView createCourseForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course-create-form");
        return modelAndView;
    }

    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public ModelAndView createCourse(
            @RequestParam("courseId") int courseId,
            @RequestParam("courseName") String courseName,
            @RequestParam("courseDesc") String courseDescription,
            @RequestParam("coursePrice") int coursePrice

    ) {
        Course course = new Course(courseId, courseName, courseDescription, coursePrice);
        courseService.createCourse(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course-listing");
        return modelAndView;
    }

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public ModelAndView getAllCourses() {
        List<Course> courseList = courseService.getAllCourses();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("course-listing");
        mv.addObject("courses", courseList);
        return mv;
    }

    @RequestMapping(value = "/courses/{courseId}", method = RequestMethod.GET)
    public ModelAndView findCourseById(@PathVariable("courseId") int courseId) {
        Course course = courseService.findCourseById(courseId);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("course-details");
        mv.addObject("course", course);
        return mv;
    }

}
