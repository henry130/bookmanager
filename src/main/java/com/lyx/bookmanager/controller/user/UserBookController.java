package com.lyx.bookmanager.controller.user;

import com.lyx.bookmanager.mapper.BookMapper;
import com.lyx.bookmanager.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/book")
public class UserBookController {
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Book> books = bookMapper.getAllBook();
        model.addAttribute("books", books);
        return "user/books";
    }

    @RequestMapping("/info/{id}")
    public String info(Model model, @PathVariable("id") String id) {
        Book book = bookMapper.getBookById(id);
        model.addAttribute("book", book);
        return "user/book_info";
    }

    @RequestMapping("/search")
    public String search(String keyword, Model model) {
        List<Book> books = bookMapper.searchBook(keyword);
        model.addAttribute("books", books);
        return "user/book_search_result";
    }
}
