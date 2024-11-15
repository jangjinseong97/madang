package com.green.madang.manager.book.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


// 응답할 때 사용하는 객체(리턴용)
@Getter
@Setter
@AllArgsConstructor // 모든 맴버필드를 넣을수 있는 생성자
public class MyResponse<T> {
    private String resultMessage;
    private T resultData;
}
