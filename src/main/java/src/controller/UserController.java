package src.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import src.constant.UrlConstant;
import src.dto.request.user.UserSignUpReq;

@RestController
public class UserController {
    @PostMapping(UrlConstant.USER_SIGNUP)
    public Object userSignUp(@RequestBody UserSignUpReq req) {
        return req;
    }
}