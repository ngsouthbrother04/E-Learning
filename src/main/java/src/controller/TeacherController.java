package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.TeacherSearchReq;
import src.dto.response.TeacherSearchRes;

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

    @PostMapping(UrlConstant.TEACHER_SEARCH)
    public Object searchTeacher(@RequestBody TeacherSearchReq req,
                                @RequestParam("sort") String sort, @RequestParam("size") int size, @RequestParam("page") int page)
    {
        TeacherSearchRes res = new TeacherSearchRes();

        res.setName(req.getName());
        res.setUsername(req.getUsername());
        res.setCreateDateFrom(req.getCreateDateFrom());
        res.setCreateDateTo(req.getCreateDateTo());
        res.setStatus(req.getStatus());
        res.setSort(sort);
        res.setSize(size);
        res.setPage(page);

        return res;
    }
}
