package fi.haagahelia.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BookController {

    @Controller
    public class MyController {
        @GetMapping("/index")
        public String home(@RequestParam) {
            // do something
            return "index"; // index.html
        }
    }
}