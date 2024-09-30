package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.AdminLoginReq;
import src.dto.request.AdminSearchReq;
import src.dto.response.AdminSearchRes;

@RestController
public class AdminController {

    @PostMapping(UrlConstant.USER_LOGIN)
    public Object login(@RequestBody AdminLoginReq req) {
        return req;
    }

    @DeleteMapping(UrlConstant.USER_DELETE)
    public Object deleteUser(@PathVariable("user_id") String user_id) {
        return user_id;
    }

    @PostMapping(UrlConstant.USER_SEARCH)
    public Object searchUser(@RequestBody AdminSearchReq req,
                             @RequestParam("sort") String sort,
                             @RequestParam("size") int size,
                             @RequestParam("page") int page)
    {
        AdminSearchRes res = new AdminSearchRes();

        res.setSort(sort);
        res.setSize(size);
        res.setPage(page);
        req.setUsername(req.getUsername());
        res.setName(req.getName());
        res.setStatus(req.getStatus());
        res.setCreateDateFrom(req.getCreateDateFrom());
        res.setCreateDateTo(req.getCreateDateTo());

        return res;
    }
}
