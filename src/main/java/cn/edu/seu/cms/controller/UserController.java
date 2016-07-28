package cn.edu.seu.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Created by sky on 2016/7/28.
 *  Description:
 */
@Controller
public class UserController {

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }
}
