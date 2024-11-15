package com.green.madang.manager.book;


import com.green.madang.manager.book.common.model.MyResponse;
import com.green.madang.manager.book.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("manager/book")
@RestController // 빈 등록 + 컨트롤러 임명, 빈등록은 스프링 컨테이너가 직접 객체화를 한다.
// 컨트롤러 임명 = 아래의 메소드들이 응답의 역할을 할것이라는 의미(특정 url에 대한 http 요청을 받고 그를 응답)
@RequiredArgsConstructor
@Tag(name = "도서", description = "도서 API")
// swaqqer 에서 controller 의 이름 + 설명
public class BookController {
    private final BookService service;

    @PostMapping
    @Operation(summary = "도서 입고", description = "도서 입고 처리 API")
    // post쪽에 들어감
    MyResponse<Integer> insBook(@RequestBody BookPostReq p ){
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
    MyResponse<Integer> delBook(BookDelReq p){
        int re = service.delBook(p);
        return new MyResponse<>("삭제 완료",re);
    }
    @GetMapping({"{bookId}"})
    MyResponse<BookGetOneReq> getOneBook(@PathVariable int bookId){
        BookGetOneReq req = service.getOneBook(bookId);
        return new MyResponse<>("글 출력",req);
    }
}
