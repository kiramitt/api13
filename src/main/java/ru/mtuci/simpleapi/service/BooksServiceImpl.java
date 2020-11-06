package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.dao.BooksRepository;
import ru.mtuci.simpleapi.model.Books;

import java.util.List;
@Service
public class BooksServiceImpl implements BooksService{

    private final BooksRepository booksRepository;

    @Autowired
    public BooksServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Books get(Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    @Override
    public List<Books> getAll() {
        return booksRepository.findAll();
    }

    @Override
    public Books save(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public void delete(Long id) {
        booksRepository.delete(id);
    }
}
