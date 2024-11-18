package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper mapper;

    int insCustomer(CustomerPostReq p){
        return mapper.insCustomer(p);
    }
    List<CustomerGetRes> selCustomer(CustomerGetReq p){
        p.setSIdx((p.getPage()-1)*p.getSize());
        return mapper.selCustomer(p);
    }
    int updCustomer(CustomerPutReq p){
        return mapper.updCustomer(p);
    }
    int delCustomer(CustomerDelReq p){
        return mapper.delCustomer(p);
    }
}
