package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.BooksRepository;
import ru.mtuci.simpleapi.model.Books;

@Component

public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final BooksRepository booksRepository;

    @Autowired
    public CommandLineAppStartupRunner(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }
    @Override
    public void run(String...args) throws Exception{
       // System.out.println(booksRepository.findById(2L).get());
        //findById(2L) 2 - ID from Database
    }

}
