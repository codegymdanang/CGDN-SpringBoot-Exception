package codegym.vn.expection.controller;

import codegym.vn.expection.entity.Book;
import codegym.vn.expection.exception.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/books")
public class BookController {


    @GetMapping("/{id}")
    public Book findOne(@PathVariable Long id) {
        throw new BookNotFoundException("Ko tim thay");
    }

    @GetMapping("/name")
    public Book findMultible(@PathVariable String id) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foo Not Found");
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
      throw new BookNotFoundException("Ko tim thay");
    }

}
