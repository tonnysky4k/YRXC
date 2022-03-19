package com.yrxc.netstat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class NetStationController {

    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }


    @RequestMapping("/About")
    public String about()
    {
        return "About";
    }

    @RequestMapping("/Contact")
    public String contact()
    {
        return "Contact";
    }

    @RequestMapping("/Customer")
    public String customer()
    {
        return "Customer";
    }
    @RequestMapping("/News")
    public String news()
    {
        return "News";
    }
    @RequestMapping("/News_Show")
    public String new_show()
    {
        return "News_show";
    }
    @RequestMapping("/Overseas")
    public String overseas()
    {
        return "Overseas";
    }
    @RequestMapping("/Overseas_Populaize")
            public String overseas_pop()
    {
        return "Overseas_Poplaize";
    }
    @RequestMapping("/Service")
    public String service()
    {
        return "Service";
    }
}
