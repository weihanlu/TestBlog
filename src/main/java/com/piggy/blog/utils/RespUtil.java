package com.piggy.blog.utils;

import com.piggy.blog.data.constant.Status;
import com.piggy.blog.data.response.Resp;

/**
 * Response工具类
 *
 * @author 韦函露
 */
public class RespUtil {

    public static <T> Resp<T> successResp(T data){
        Resp<T> resp = new Resp<>();
        resp.setErrorCode(Status.ApiErr.SUCCESS.getCode());
        resp.setErrorMessage(Status.ApiErr.SUCCESS.getMsg());
        resp.setData(data);
        return resp;
    }

    public static Resp successResp(){
        return successResp(null);
    }

    public static Resp errorResp(Integer errCode, String errMsg){
        Resp resp = new Resp();
        resp.setErrorCode(errCode);
        resp.setErrorMessage(errMsg);
        resp.setData(null);
        return resp;
    }
}
