package com.green.madang.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPostReq {
    @Schema(title = "고객 번호", description = "필수로 입력", requiredMode = Schema.RequiredMode.REQUIRED)
    private int custId;
    @Schema(title = "책 번호", description = "필수로 입력", requiredMode = Schema.RequiredMode.REQUIRED)
    private int bookId;
}
