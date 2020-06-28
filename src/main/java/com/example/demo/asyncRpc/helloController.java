package com.example.demo.asyncRpc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName helloController
 * @Description: TODO
 * @Author chenshilong
 * @Date 2020/3/13 0013
 * @Version 1.0
 **/
@RestController
public class helloController {

    @RequestMapping("/ttt")
    public String test(){
        return "123";
    }

}
