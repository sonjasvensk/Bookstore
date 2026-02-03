package fi.haagahelia.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.haagahelia.bookstore.domain.Book;

@Controller
public class BookController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("book", new Book());
        return "index"; // index.html
    }
}
