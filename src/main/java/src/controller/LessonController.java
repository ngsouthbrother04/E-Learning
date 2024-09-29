package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.reqest.LessonReq;

@RestController
public class LessonController {

    @PostMapping(UrlConstant.LESSON_ADD)
    public Object addLesson(@RequestBody LessonReq req) {
        return req;
    }

    @PutMapping(UrlConstant.LESSON_UPDATE)
    public Object updateLesson(@PathVariable("lesson_id") int id) {
        
    }
}