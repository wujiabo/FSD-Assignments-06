package com.wujiabo.fsd.exception;

import com.wujiabo.fsd.domain.ResultJson;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }
}
