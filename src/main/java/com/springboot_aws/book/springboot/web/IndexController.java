package com.springboot_aws.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    // posts-save.mustache 호출 API
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
