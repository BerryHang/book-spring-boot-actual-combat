package com.learning.spring.boot.domain.response;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @Package: com.learning.spring.boot.domain.response
 * @ClassName: CommonResponse
 * @Author: beibei.huang
 * @Description: ${description}
 * @Date: 2019/3/12 16:46
 */
@AllArgsConstructor
@RequiredArgsConstructor
public class CommonResponse<T> {

    @NonNull
    private String statusCode;

    @NonNull
    private String message;

    private T data;

}
