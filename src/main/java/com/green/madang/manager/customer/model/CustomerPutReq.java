package com.green.madang.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerPutReq {
    @Schema(title = "고객 번호", description = "필수로 입력",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private int custId;
    @Schema(title = "이름",example = " ")
    private String name;
    @Schema(title = "주소",example = " ")
    private String address;
    @Schema(title = "번호",example = " ")
    private String phone;
}
