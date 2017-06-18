package com.kasperskove.kasperskove.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KaspersKoveController {

    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String index () {

        return "index";
    }

    @RequestMapping (value = "/about", method = RequestMethod.GET)
    public String about () {

        return "about";
    }


}
