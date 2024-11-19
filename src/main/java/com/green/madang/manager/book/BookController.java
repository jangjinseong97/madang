package com.green.madang.manager.book;


import com.green.madang.common.model.MyResponse;
import com.green.madang.manager.book.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j // println 대신 사용
// 콘솔에 찍고싶은 내용이 있다면
// 아래의 log.으로 시작하는 3종류를 사용

@RequestMapping("manager/book")
@RestController // 빈 등록 + 컨트롤러 임명, 빈등록은 스프링 컨테이너가 직접 객체화를 한다.
// 컨트롤러 임명 = 아래의 메소드들이 응답의 역할을 할것이라는 의미(특정 url에 대한 http 요청을 받고 그를 응답)
@RequiredArgsConstructor
@Tag(name = "도서", description = "도서 API")
// swagger 에서 controller 의 이름 + 설명
// 따로 작성 안하면 기본적으로 클래스명이 swagger 에 적힘
public class BookController {
    private final BookService service;

    @PostMapping
    @Operation(summary = "도서 입고", description = "도서 입고 처리 API")
    // swagger에 post쪽에 들어감
    MyResponse<Integer> insBook(@RequestBody BookPostReq p ){
        log.info("info"); // 정보
        log.info("info {}", p); // p가 가진값을 {}에 문자열로 변환해서 넣는식
        log.warn("warn"); // 경고문
        log.error("error"); // 에러
        int result = service.insBook(p);
//        MyResponse<Integer> response = new MyResponse<>("책 등록 완료",result);
//        return response;
        return new MyResponse<>("책 등록 완료",result);
    }
    @GetMapping
    MyResponse<List<BookGetRes>> getBook(@ParameterObject BookGetReq p){
        // ModelAttribute 는 생략 가능
        List<BookGetRes> res = service.getBook(p);
        return new MyResponse<>(p.getPage() +"페이지 출력",res );
        // get 방식이니까 key값으로 찾는것(쿼리스트링 방식)
    }
    @PutMapping
    MyResponse<Integer> updateBook(@RequestBody BookUpdateReq p){
        int re = service.updBook(p);
        return new MyResponse<>("수정 완료",re);
    }
    @DeleteMapping
    MyResponse<Integer> delBook(@ParameterObject BookDelReq p){
        int re = service.delBook(p);
        return new MyResponse<>("삭제 완료",re);
    }
    @GetMapping({"{bookId}"})
    MyResponse<BookGetOneReq> getOneBook(@PathVariable int bookId){
        BookGetOneReq req = service.getOneBook(bookId);
        return new MyResponse<>("글 출력",req);
    }
}
