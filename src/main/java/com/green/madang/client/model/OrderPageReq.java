package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPageReq {
    private int page;
    private int size;
    @JsonIgnore
    private int sIdx;
}
