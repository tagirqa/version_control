package com.github.tagirqa.controller;

import com.github.tagirqa.entity.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    Application application = new Application("null");

    @GetMapping(value = "/version")
    public String getVersion() {
        return application.getVersion();
    }

    @PostMapping(value = "/version/{version}")
    public void setVersion(@PathVariable String version) {
        application.setVersion(version);
    }
}
