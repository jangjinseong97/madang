package com.green.madang.manager.book.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookGetRes {
    private int bookId;
    private String bookName;
    private String publisher;
    private int price;
    // get이므로 값을 받을땐 위의 값들로 받으므로 Res에 이 4개
}
