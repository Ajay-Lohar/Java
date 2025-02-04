package com.ajay.demo1;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @RequestMapping("Massage")
    public static String myMethod() {
        int number = 55;
        return  "<h1>"+number+"</h1>"
        +"<h1>number</h1>" ;
    }

    @GetMapping("process-form")
    public static String getData(@RequestParam int num1,@RequestParam int num2) {
        int result = num1 +num2 ;
//        return  String.valueOf(result);  thise line and below line statement is similer
        return "Result = "+ result;
    }
    @PostMapping("process-form")
    public static String PostData(@RequestParam int num1,@RequestParam int num2) {
        int result = num1 +num2 ;
//        return  String.valueOf(result);  thise line and below line statement is similer
        return "Result = "+ result;
    }

}
