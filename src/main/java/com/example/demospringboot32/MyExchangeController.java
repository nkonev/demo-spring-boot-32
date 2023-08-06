package com.example.demospringboot32;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.HttpExchange;

@Controller
//@RequestMapping("/ex")
@HttpExchange("/ex")
public class MyExchangeController {

    @ResponseBody
    @GetMapping(value = "/hi")
    public String getHi() {
        return "hi there from @HttpExchange!";
    }

}
