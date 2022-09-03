package org.artiver.myspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String IndexHtml(HashMap<String, Object> map, Model model) {
        model.addAttribute("word", "Welcome");
        logger.info("[IndexController] 访问了主页");
        return "index";
    }
}
