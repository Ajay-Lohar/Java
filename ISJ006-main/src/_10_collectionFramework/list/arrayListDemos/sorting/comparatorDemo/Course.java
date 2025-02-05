package _10_collectionFramework.list.sorting.comparatorDemo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Course /*implements Comparable<Course>*/ {
    private int courseId;
    private String courseName;
    private int coursePrice;
    private String courseContent;
    private int courseDuration;

    /*@Override
    public int compareTo(Course o) {
        return this.courseId - o.courseId;
    }*/
}
