package com.example.study.controller;

import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
    public String getRequest(){
        return "Hi getMethod";
    }

    @RequestMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){
        System.out.println(id);
        System.out.println(pwd);
        return id+pwd;
    }

    @GetMapping("/getMultiParameter") // http://localhost:8080/api/getMultiParameter?account=asfd&email=sudy@gmail.com&page=10
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam;
    }

    @GetMapping("/header")
    public Header getHeader(){

        // {"resultCode" : "OK", "description" : "OK"}
        return Header.builder().resultCode("Ok").description("OK").build();
    }
}