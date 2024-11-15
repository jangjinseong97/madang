package com.green.madang.manager.book.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookUpdateReq {
    private int bookId;
    private String bookName;
    private String publisher;
    private int price;
    // price 의 null 채크를 위해(가격수정이 없는 경우 패스)
    // int를 사용 했을떄 쿼리스트링에 추가하지 않았다면 0이였으므로(null 을 넣지 못해서)
    // integer 는 쿼리스트링에 안 넣었을때 null
}
