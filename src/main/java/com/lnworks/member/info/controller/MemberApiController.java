package com.lnworks.member.info.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberApiController {

    @PostMapping("/user-list")
    public HashMap userList(@RequestParam Map<String, String> parameters) throws Exception {
        HashMap resultMap = new HashMap<>();

        resultMap.put("userList", "isUserList");

        return resultMap;
    }
}
