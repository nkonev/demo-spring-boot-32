package com.example.demospringboot32;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class MyExchangeController {

    @Autowired
    private JdbcClient jdbcClient;

    @GetExchange(value = "/ex/hi")
    public String getHi() {

        var list = jdbcClient.sql("SELECT * FROM user_account").query(UserAccount.class).list();
        for (var el : list) {
            System.out.println("=>"+el);
        }

        return "hi there from @HttpExchange!";
    }

}
