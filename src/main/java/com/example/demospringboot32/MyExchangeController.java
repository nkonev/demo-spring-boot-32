package com.example.demospringboot32;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class MyExchangeController {

    @GetExchange(value = "/ex/hi")
    public String getHi() {
        return "hi there from @HttpExchange!";
    }

}
