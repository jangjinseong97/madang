package com.green.madang.manager.book;

import com.green.madang.manager.book.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper mapper;

    int insBook(BookPostReq p){
        return mapper.insBook(p);
    }

    List<BookGetRes> getBook(BookGetReq p){
        int a = (p.getPage()-1)*p.getSize();
        p.setSIdx(a);
        return mapper.selBook(p);
    }
    int updBook(BookUpdateReq p){
        return mapper.updBook(p);
    }
    int delBook(BookDelReq p){
        return mapper.delBook(p);
    }
    BookGetOneReq getOneBook(int p){
        return mapper.selOneBook(p);
    }
}
