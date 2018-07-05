package com.piggy.blog.data.response;

import lombok.Data;

/**
 * @author 韦函露
 * @version 2.0.1 创建时间: 2018/2/23 17:40
 * <p>
 * 类说明：
 *     Resp返回
 */
@Data
public class Resp<T> {

    /**
     * error_code : 2000
     * error_message : 错误信息
     * data : {}
     */

    private Integer errorCode;
    private String errorMessage;
    private T data;
}
