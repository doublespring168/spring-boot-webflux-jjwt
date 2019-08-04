package com.oauth2.springbootwebfluxjjwt.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 功能说明：无权限验证页面
 */
@RestController
public class AboutController {
    @GetMapping(value = "/about")
    public Mono<ResponseEntity<?>> login() {
        ResponseEntity<String> about = ResponseEntity.ok().body("请求的是/about,不需要权限验证");
        return Mono.just(about);
    }

    @GetMapping(value = "/logined")
    public Mono<ResponseEntity<?>> logined() {
        ResponseEntity<String> logined = ResponseEntity.ok().body("请求的是/logined,需要登录");
        return Mono.just(logined);
    }
}
