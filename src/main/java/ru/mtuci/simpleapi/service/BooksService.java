package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.model.Books;

import java.util.List;

public interface BooksService {
    Books get(Long id);
    List<Books> getAll();
    Books save(Books books);
    void delete(Long id);
}
