package com.wujiabo.fsd.exception;

import com.wujiabo.fsd.domain.ResultJson;

public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }

    public ResultJson getResultJson() {
        return resultJson;
    }
}
