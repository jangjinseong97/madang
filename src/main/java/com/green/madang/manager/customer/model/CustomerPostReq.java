package com.green.madang.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerPostReq {
//    private String custName; 테이블에선 name이였으니 아래가 더 좋긴했다.
    @Schema(title = "이름", example = "홍길동", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    // 실제로는 name 이 중복되는 경우가 많아서 그대로 쓰일일은 없긴 하다.
    private String address;
    @Schema(title = "휴대폰번호", description = "###-####-####", example = "000-0000-0000",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String phone;
}
