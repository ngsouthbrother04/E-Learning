package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.reqest.UserLoginReq;
import src.dto.reqest.UserSearchReq;
import src.dto.response.UserSearchRes;

@RestController
public class UserController {

    @PostMapping(UrlConstant.USER_LOGIN)
    public Object login(@RequestBody UserLoginReq req) {
        return req;
    }

    @DeleteMapping(UrlConstant.USER_DELETE)
    public Object deleteUser(@PathVariable("user_id") String user_id) {
        return user_id;
    }

    @PostMapping(UrlConstant.USER_SEARCH)
    public Object searchUser(@RequestBody UserSearchReq req,
                             @RequestParam("sort") String sort,
                             @RequestParam("size") int size,
                             @RequestParam("page") int page)
    {
        UserSearchRes res = new UserSearchRes();

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
