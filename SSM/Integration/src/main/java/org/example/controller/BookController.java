package org.example.controller;

import org.example.pojo.Books;
import org.example.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

        @Autowired
        @Qualifier("BookServiceImpl")
        private bookService bookService;

        @RequestMapping("/allBook")
        public String list(Model model){
                List<Books> books = bookService.queryAllBook();
                        model.addAttribute("books",books);
                return "allBook";
        }
}
