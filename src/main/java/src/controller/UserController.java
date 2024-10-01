package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.user.UserLoginReq;
import src.dto.request.user.UserSignUpCourseReq;
import src.dto.request.user.UserSignUpReq;
import src.dto.response.user.UserSignUpCourseRes;

@RestController
public class UserController {

    @PostMapping(UrlConstant.USER_SIGNUP)
    public Object userSignUp(@RequestBody UserSignUpReq req) {
        return req;
    }

    @PostMapping(UrlConstant.USER_LOGIN)
    public Object userLogin(@RequestBody UserLoginReq req) {
        return req;
    }

    @PutMapping(UrlConstant.USER_UPDATE)
    public Object updateUser() {
        return null;
    }

    @DeleteMapping(UrlConstant.USER_DELETE)
    public Object deleteUser(@PathVariable("user_id") String user_id) {
        return user_id;
    }

    @PostMapping(UrlConstant.USER_SIGNUP_COURSE)
    public Object userSignUpCourse(@RequestBody UserSignUpCourseReq req) {
        UserSignUpCourseRes res = new UserSignUpCourseRes();

        res.setCourseId(req.getCourseId());
        res.setUserId(req.getUserId());
        res.setStatus("...");

        return res;
    }
}