package com.learning.spring.boot.exception;

/**
 * @Package: com.learning.spring.boot.exception
 * @ClassName: ServiceException
 * @Author: beibei.huang
 * @Description: 封装业务异常
 * @Date: 2019/3/14 15:01
 */
public class ServiceException extends RuntimeException{
    private String errorCode;

    private String message;

    public ServiceException(String message) {
        super(message);
        this.message = message;
    }

    public ServiceException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }
}
