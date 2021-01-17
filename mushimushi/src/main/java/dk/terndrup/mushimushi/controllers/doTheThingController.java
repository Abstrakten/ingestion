package dk.terndrup.mushimushi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doTheThingController {

    @GetMapping(path = "/")
    public ResponseEntity<String> doTheThing() {
        return ResponseEntity.ok("I might be a teapot");
    }

}
