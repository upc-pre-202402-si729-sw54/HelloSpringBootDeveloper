package com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.controllers;

import com.acme.platform.hellospringbootdeveloper.generic.domain.model.entities.WelcomeBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping
    public String welcome() {
        return WelcomeBuilder.build(null);
    }

    @RequestMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return WelcomeBuilder.build(name);
    }
}
