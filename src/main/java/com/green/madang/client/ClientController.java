package com.green.madang.client;

import com.green.madang.client.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;
import com.green.madang.common.model.MyResponse;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("client")
@Slf4j
@Tag(name="주문")
public class ClientController {
    private final ClientService service;

    @PostMapping("order")
    @Operation(summary = "책 주문")
    public MyResponse<Integer> insdOrders(@RequestBody OrderPostReq p){
        return new MyResponse<>("주문 완료", service.insdOrders(p));
    }

    @GetMapping
    @Operation(summary = "책 주문 리스트(개인)")
    public MyResponse<List<OrderGetRes>> selOrders(@ParameterObject OrderGetReq p){
        return new MyResponse<>("조회 완료",service.selOrders(p));
    };

    @GetMapping("all")
    @Operation(summary = "책 주문 리스트(전체)")
    public MyResponse<List<OrderPageRes>> selPageOrders(@ParameterObject OrderPageReq p){
        return new MyResponse<>("조회 완료",service.selPageOrders(p));
    }
}
