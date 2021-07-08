package springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getMessages() {
        return new ResponseEntity<>("{ \"a\":\"aaa\"}", HttpStatus.OK);
    }

}
