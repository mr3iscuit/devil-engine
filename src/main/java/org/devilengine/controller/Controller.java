package org.devilengine.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class Controller {

    @GetMapping("/ok")
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("OK");
    }

}