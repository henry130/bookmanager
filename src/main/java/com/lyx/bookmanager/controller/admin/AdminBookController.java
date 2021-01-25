package com.lyx.bookmanager.controller.admin;

import com.lyx.bookmanager.mapper.BookMapper;
import com.lyx.bookmanager.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/book")
public class AdminBookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Book> books = bookMapper.getAllBook();
        model.addAttribute("books", books);
        return "admin/books";
    }

    @RequestMapping("/info/{id}")
    public String info(Model model, @PathVariable("id") String id) {
        Book book = bookMapper.getBookById(id);
        model.addAttribute("book", book);
        return "admin/book_info";
    }

    @RequestMapping("/toEditPage/{id}")
    public String toEditPage(Model model, @PathVariable("id") String id) {
        Book book = bookMapper.getBookById(id);
        model.addAttribute("book", book);
        return "admin/book_edit";
    }

    @RequestMapping("/update")
    public String update(Book book) {
        bookMapper.updateBook(book);
        return "redirect:/admin/book/getAll";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        bookMapper.deleteBook(id);
        return "redirect:/admin/book/getAll";
    }

    @RequestMapping("/toAddPage")
    public String toAddPage() {
        return "admin/book_add";
    }

    @RequestMapping("/add")
    public String add(Book book) {
        bookMapper.addBook(book);
        return "redirect:/admin/book/getAll";
    }

    @RequestMapping("/search")
    public String search(String keyword, Model model) {
        List<Book> books = bookMapper.searchBook(keyword);
        model.addAttribute("books", books);
        return "admin/book_search_result";
    }
}
