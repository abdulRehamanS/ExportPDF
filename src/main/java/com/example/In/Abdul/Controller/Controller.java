package com.example.In.Abdul.Controller;


import com.example.In.Abdul.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class Controller {

    @Autowired
    Service service;


    @GetMapping(value = "/pdf")
    public void generatePdf(HttpServletResponse response) throws IOException {

        response.setContentType("application/pdf");

        String Key = "Content-Disposition";
        String Value = "attachment;plans";

        response.setHeader(Key, Value);


        service.generatePdf(response);

        response.flushBuffer();


    }
}
