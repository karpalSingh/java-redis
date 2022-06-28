package com.learning.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path={"/"}, produces = {MediaType.TEXT_HTML_VALUE})
    public String index() {
        return "hello world";
    }
}
