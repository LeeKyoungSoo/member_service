package com.lnworks.member.board.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardApiController {

    @PostMapping("/board-list")
    public HashMap boardList(@RequestParam Map<String, String> parameters) throws Exception {
        HashMap resultMap = new HashMap<>();

        resultMap.put("boardList", "isBoardList");

        return resultMap;
    }
}
