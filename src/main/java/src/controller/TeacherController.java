package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;

@RestController
public class TeacherController {

    @PutMapping(UrlConstant.TEACHER_UPDATE)
    public Object updateTeacher(@PathVariable("teacher_id") String teacher_id) {
        return teacher_id;
    }

    @DeleteMapping(UrlConstant.TEACHER_DELETE)
    public Object deleteTeacher(@PathVariable("teacher_id") String teacher_id) {
        return teacher_id;
    }

}
