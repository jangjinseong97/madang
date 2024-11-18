package com.green.madang.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDelReq {
    @Schema(description = "삭제하고싶은 고객번호")
    private int custId;
}
