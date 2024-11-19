package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderGetRes {
    private int price;
    @JsonProperty("book_id")
    private int bookId;
    private String bookName;
    private String publisher;
}
