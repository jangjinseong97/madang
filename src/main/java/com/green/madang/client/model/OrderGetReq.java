package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderGetReq {
    @Schema(description = "고객 번호", requiredMode = Schema.RequiredMode.REQUIRED)
    private int custId;
    @Schema(description = "한 페이지에 보고싶은 글 갯수", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    private int size;
    @Schema(description = "페이지 번호", example = "1",requiredMode = Schema.RequiredMode.REQUIRED)
    private int page;
    @JsonIgnore
    private int sIdx;
}
