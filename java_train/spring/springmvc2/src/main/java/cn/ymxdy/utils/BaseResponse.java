package cn.ymxdy.utils;

import lombok.Data;

/**
 * @author wf
 * @date 2021/12/30 18:50
 * @description 统一返回的格式
 */
@Data
public class BaseResponse {
    private static final long serialVersionUID = 1L;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回的数据
     */
    private Object data;


    public BaseResponse() {

    }

    private BaseResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private BaseResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private BaseResponse(Object data) {
        this.code = 200;
        this.data = data;
    }

    private BaseResponse(String message, Object data) {
        this.code = 200;
        this.message = message;
        this.data = data;
    }

    private BaseResponse(String message) {
        this.code = 200;
        this.message = message;
    }

    public static BaseResponse successed(Object data) {
        return new BaseResponse(data);
    }

    public static BaseResponse successed(Integer code, String message, Object data) {
        return new BaseResponse(code, message, data);
    }

    public static BaseResponse successed(Integer code,String message) {
        return new BaseResponse(code,message);
    }

    public static BaseResponse failed(Integer code, String message) {
        return new BaseResponse(code, message);
    }

    public static BaseResponse failed(Integer code, String message, Object data) {
        return new BaseResponse(code, message, data);
    }
}
