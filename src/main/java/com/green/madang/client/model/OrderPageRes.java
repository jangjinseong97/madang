package com.green.madang.client.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPageRes {
    private int orderId;
    private int custId;
    private int bookId;
    private String name;
    private String bookName;
    private int salePrice;
    private String orderDate;
}
