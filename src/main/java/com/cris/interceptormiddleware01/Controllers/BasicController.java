package com.cris.interceptormiddleware01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping
    public String dateTimeNow() {
        return OffsetDateTime.now().toString();
    }
}
