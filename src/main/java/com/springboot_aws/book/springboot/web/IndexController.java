package com.springboot_aws.book.springboot.web;

import com.springboot_aws.book.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private  final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        // 서버 템플릿 엔진에서 사용할 수 있는 객체를 저장할 수 있다.
        // 여기서는 posts 라는 이름으로 index.mustache 에 전달한다.
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    // posts-save.mustache 호출 API
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
