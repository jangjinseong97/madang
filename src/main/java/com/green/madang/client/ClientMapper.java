package com.green.madang.client;

import com.green.madang.client.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {
    int insdOrders(OrderPostReq p);
    List<OrderGetRes> selOrders(OrderGetReq p);
    List<OrderPageRes> selPageOrders(OrderPageReq p);
}
