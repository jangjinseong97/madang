package com.green.madang.manager.customer;

import com.green.madang.manager.book.common.model.MyResponse;
import com.green.madang.manager.customer.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("manager/customer")
@Slf4j
@Tag(name="고객", description = "고객 관리")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    @Operation(summary = "고객 등록",description = "고객 등록 API")
    MyResponse<Integer> insCustomer(@RequestBody CustomerPostReq p){
//        int result = service.insCustomer(p);
        return new MyResponse<>("고객 등록 완료",service.insCustomer(p));
    }

    @GetMapping
    @Operation(summary = "고객 조회")
    MyResponse<List<CustomerGetRes>> selCustomer(@ParameterObject CustomerGetReq p){
        return new MyResponse<>("고객 조회",service.selCustomer(p));
    }

    @PutMapping
    @Operation(summary = "고객정보 수정")
    MyResponse<Integer> updCustomer(@RequestBody CustomerPutReq p){
        return new MyResponse<>("수정 완료", service.updCustomer(p));
    }

    @DeleteMapping
    @Operation(summary = "고객정보 삭제")
    MyResponse<Integer> delCustomer(@ParameterObject CustomerDelReq p){
        return new MyResponse<>("삭제 완료", service.delCustomer(p));
    }
    // @ModelAttribute 생략 된거지만 이때 파라미터에 int 와 같은 기본타입이들어 갔다면
    // @RequestParam 이 들어갔어야 됬다.?
}
