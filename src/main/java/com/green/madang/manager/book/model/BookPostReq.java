package com.green.madang.manager.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookPostReq {
//    private int bookId; insert때 프론트는 pk(id값)에 관여하지 않는다.
    @Schema(title = "책이름", description = "x")
    // 뒤의 description 은 주고싶으면 주고 안줘도 되는것
    private String bookName;
    @Schema(title = "출판사이름")
    private String publisher;
    @Schema(title = "도사 가격")
    private int price;
}
