package com.green.madang.manager.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerGetReq {

    @Schema(description = "페이지 값", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int page;
    @Schema(description = "페이지에 보이는 고객수", example = "50", requiredMode = Schema.RequiredMode.REQUIRED)
    private int size;
    @JsonIgnore
    private int sIdx;
    @Schema(description = "검색 타입: name, address, phone 중 하나로", example =" ")
    private String searchType;
    @Schema(description = "검색내용",example = " ")
    private String searchText;
}
