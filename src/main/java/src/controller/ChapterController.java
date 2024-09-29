package src.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import src.constant.UrlConstant;
import src.dto.reqest.ChapterReq;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChapterController {

    @PostMapping(UrlConstant.CHAPTER_ADD)
    public Object addChapter(@RequestBody List<ChapterReq> req) {
        if(req == null) req = new ArrayList<ChapterReq>();
        return req;
    }

}