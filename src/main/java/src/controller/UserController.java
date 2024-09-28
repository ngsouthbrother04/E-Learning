package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.reqest.UserLoginReq;

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
}
