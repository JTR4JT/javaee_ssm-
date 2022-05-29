package service.impl;

import itheima.dao.BookMapper;
import domain.Book;
import service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }
}

