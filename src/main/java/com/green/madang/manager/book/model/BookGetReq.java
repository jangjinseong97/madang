package com.green.madang.manager.book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookGetReq {
//    @Schema(title ="page값")
    private int page;
    private int size;
    private String searchText;
     @JsonIgnore
     // 안넣으면 아래까지 swagger 문서에 나옴
    private int sIdx;
    // 받아야 되는 값
}
