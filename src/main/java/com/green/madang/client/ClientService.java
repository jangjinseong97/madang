package com.green.madang.client;

import com.green.madang.client.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientMapper mapper;

    int insdOrders(OrderPostReq p){
        p.getOrderId();
        int r = mapper.insdOrders(p);
        p.getOrderId();
        return mapper.insdOrders(p);
    }
    List<OrderGetRes> selOrders(OrderGetReq p){
        p.setSIdx((p.getPage()-1)*p.getSize());
        return mapper.selOrders(p);
    }

    List<OrderPageRes> selPageOrders(OrderPageReq p){
        p.setSIdx((p.getPage()-1)*p.getSize());
        return mapper.selPageOrders(p);
    }
}
