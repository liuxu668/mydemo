package org.java.mydemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(description = "第一个测试接口")
@Controller
public class FirstController {

    @ApiOperation(value = "第一个测试方法")
    @RequestMapping(value = "/first",method = {RequestMethod.GET,RequestMethod.POST})
    public String first(){

        return "index";
    }

}
