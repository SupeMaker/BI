package com.huaxing.bi.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVO<T> {
    private final Integer status;

    private final String message;

    private final T data;

    public ResponseVO(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseVO<T> ok(String message, T data) {
        return new ResponseVO<>(200, message, data);
    }

    public static <T> ResponseVO<T> ok( T data) {
        return new ResponseVO<>(200, null, data);
    }

    public static <T> ResponseVO<T> error(String message, T data) {
        return new ResponseVO<>(400, message, data);
    }

}

