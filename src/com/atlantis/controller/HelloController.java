package com.atlantis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA
 * HelloController class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/8/5
 * Time: 下午10:48
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("msg","Hello Spring MVC FrameWork,Atlantis!");
        return "index";
    }
}
