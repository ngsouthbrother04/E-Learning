package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.reqest.CourseReq;
import src.dto.response.AddingCourseRes;

@RestController
public class CourseController {

    @PostMapping(UrlConstant.COURSE_ADD)
    public Object addCourse(
            @RequestBody CourseReq req,
            @RequestParam("id") int id)
    {
        AddingCourseRes res = new AddingCourseRes();

        res.setName(req.getName());
        res.setDescription(req.getDescription());
        res.setCreatedDate(req.getCreatedDate());
        res.setUpdatedDate(req.getUpdatedDate());
        res.setStatus(req.getStatus());
        res.setId(id);

        return res;
    }

    @PutMapping(UrlConstant.COURSE_UPDATE)
    public Object updateCourse(@PathVariable("course_id") int id) {
        return id;
    }

    @DeleteMapping(UrlConstant.COURSE_DELETE)
    public Object deleteCourse(@PathVariable("course_id") int id, @RequestBody CourseReq req) {
        AddingCourseRes res = new AddingCourseRes();

        res.setName(req.getName());
        res.setDescription(req.getDescription());
        res.setCreatedDate(req.getCreatedDate());
        res.setUpdatedDate(req.getUpdatedDate());
        res.setStatus(req.getStatus());
        res.setId(id);

        return res;
    }
}