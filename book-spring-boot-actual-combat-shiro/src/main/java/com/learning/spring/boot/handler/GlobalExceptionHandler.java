package com.learning.spring.boot.handler;

import com.learning.spring.boot.domain.response.CommonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Package: com.learning.spring.boot.handler
 * @ClassName: globalExceptionHandler
 * @Author: beibei.huang
 * @Description: ${description}
 * @Date: 2019/3/12 16:44
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResponse exceptionHandler(Exception e){
        return new CommonResponse("500",e.getMessage());
    }

}
