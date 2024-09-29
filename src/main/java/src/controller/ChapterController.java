package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.reqest.ChapterReq;
import src.dto.response.ChapterRes;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChapterController {

    @PostMapping(UrlConstant.CHAPTER_ADD)
    public Object addChapter(@RequestBody List<ChapterReq> req) {
        if(req == null) req = new ArrayList<ChapterReq>();
        return req;
    }

    @PutMapping(UrlConstant.CHAPTER_UPDATE)
    public Object updateChapter(@PathVariable("chapter_id") int chapter_id) {
        return chapter_id;
    }

    @DeleteMapping(UrlConstant.CHAPTER_DELETE)
    public Object deleteChapter(@PathVariable("chapter_id") int chapter_id, @RequestBody ChapterReq req) {
        ChapterRes res = new ChapterRes();

        res.setName(req.getName());
        res.setStatus("INACTIVE");
        res.setDescription(req.getDescription());
        res.setCreatedDate(req.getCreatedDate());
        res.setUpdatedDate(req.getUpdatedDate());
        res.setOrder(req.getOrder());

        return res;
    }
}