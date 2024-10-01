package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.CourseReq;
import src.dto.request.CourseSearchReq;
import src.dto.request.user.CourseDetailReq;
import src.dto.response.CourseRes;
import src.dto.response.CourseSearchRes;

@RestController
public class CourseController {

    @GetMapping(UrlConstant.COURSE_DETAIL)
    public Object courseDetail(CourseDetailReq req) {
        return req;
    }

    @PostMapping(UrlConstant.COURSE_ADD)
    public Object addCourse(
            @RequestBody CourseReq req,
            @RequestParam("id") int id)
    {
        CourseRes res = new CourseRes();

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
        CourseRes res = new CourseRes();

        res.setName(req.getName());
        res.setDescription(req.getDescription());
        res.setCreatedDate(req.getCreatedDate());
        res.setUpdatedDate(req.getUpdatedDate());
        res.setStatus(req.getStatus());
        res.setId(id);

        return res;
    }

    @PostMapping(UrlConstant.COURSE_SEARCH)
    public Object searchCourse(@RequestBody CourseSearchReq req, @RequestParam("sort") String sort, @RequestParam("page") int page, @RequestParam("size") int size) {
        CourseSearchRes res = new CourseSearchRes();

        res.setName(req.getName());
        res.setCreateDateFrom(req.getCreateDateFrom());
        res.setCreateDateTo(req.getCreateDateFrom());
        res.setStatus(req.getStatus());
        res.setRatingFrom(req.getRatingFrom());
        res.setRatingTo(req.getRatingTo());
        res.setSort(sort);
        res.setPage(page);
        res.setSize(size);

        return res;
    }
}