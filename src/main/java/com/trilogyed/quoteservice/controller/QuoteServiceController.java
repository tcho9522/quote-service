package com.trilogyed.quoteservice.controller;

import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RefreshScope
public class QuoteServiceController {
    @Value("${quote1}")
    private String q1;
    @Value("${quote2}")
    private String q2;
    @Value("${quote3}")
    private String q3;
    @Value("${quote4}")
    private String q4;
    @Value("${quote5}")
    private String q5;
    @Value("${quote6}")
    private String q6;
    @Value("${quote7}")
    private String q7;
    @Value("${quote8}")
    private String q8;
    Random random = new Random();
    List<String> quoteList = new ArrayList<>();
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public String getQuote() {
        quoteList.add(q1);
        quoteList.add(q2);
        quoteList.add(q3);
        quoteList.add(q4);
        quoteList.add(q5);
        quoteList.add(q6);
        quoteList.add(q7);
        quoteList.add(q8);

        return quoteList.get(random.nextInt(8));
    }
}
