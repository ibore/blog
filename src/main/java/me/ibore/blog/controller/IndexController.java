package me.ibore.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/19.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

}
