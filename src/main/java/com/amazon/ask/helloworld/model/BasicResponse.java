package com.amazon.ask.helloworld.model;

/**
 * Created by pupi on 22/05/18.
 */
public class BasicResponse {
    private Integer code;
    private String body;

    public BasicResponse(Integer code, String body) {
        this.code = code;
        this.body = body;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "BasicResponse{" +
                "code=" + code +
                ", body='" + body + '\'' +
                '}';
    }
}
