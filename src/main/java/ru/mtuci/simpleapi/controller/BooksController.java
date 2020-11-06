package ru.mtuci.simpleapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simpleapi.model.Books;
import ru.mtuci.simpleapi.service.BooksService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = BooksController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)

public class BooksController {
    public static final String REST_URL = "/api/v1/books";

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping(value = "/{id}")
    public Books get(@PathVariable("id")Long id){
        log.info("get"+id);
        return booksService.get(id);
    }
    @GetMapping
    public List<Books> getALL(){
        log.info("getALL");
        return booksService.getAll();
    }
    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE)
    public Books save(@RequestBody Books books){
        log.info("save"+books);
        return booksService.save(books);
    }
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete (@PathVariable("id")Long id){
        log.info("delete"+id);
        booksService.delete(id);
    }
}