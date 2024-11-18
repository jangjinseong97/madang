package com.green.madang.manager.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookPostReq {
//    private int bookId; insert때 프론트는 pk(id값)에 관여하지 않는다.
    @Schema(description = "x",
            example = "예시", requiredMode = Schema.RequiredMode.REQUIRED)
    // 뒤의 description 은 주고싶으면 주고 안줘도 되는것
    private String bookName;
    @Schema(title ="바뀌긴함?", requiredMode = Schema.RequiredMode.REQUIRED)
    private String publisher;
    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private int price;
}
