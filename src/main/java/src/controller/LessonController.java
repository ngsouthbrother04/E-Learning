package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.LessonReq;
import src.dto.response.LessonRes;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LessonController {

    @PostMapping(UrlConstant.LESSON_ADD)
    public Object addLesson(@RequestBody List<LessonReq> req) {
        if(req == null) req = new ArrayList<LessonReq>();
        return req;
    }

    @PutMapping(UrlConstant.LESSON_UPDATE)
    public Object updateLesson(@PathVariable("lesson_id") int id) {
        return id;
    }

    @DeleteMapping(UrlConstant.LESSON_DELETE)
    public Object deleteLesson(@PathVariable("lesson_id") int id, @RequestBody LessonReq req) {
        LessonRes res = new LessonRes();

        res.setName(req.getName());
        res.setType(req.getType());
        res.setDescription(req.getDescription());
        res.setOrder(req.getOrder());
        res.setUrl(req.getUrl());
        res.setCreatedDate(req.getCreatedDate());
        res.setUpdatedDate(req.getUpdatedDate());
        res.setStatus("INACTIVE");

        return res;
    }
}