package com.piggy.blog.data.constant;

/**
 * 状态码常数类
 *
 * @author 韦函露
 */
public class Status {
    public enum Common {
        /**
         * 公用状态
         */
        INVALID(0, "失效"),
        VALID(1, "有效");

        private Integer value;
        private String msg;

        Common(Integer value, String msg) {
            this.value = value;
            this.msg = msg;
        }

        public Integer getInt() {
            return value;
        }
        public String getMsg(){return msg;}
    }

    public static enum ApiErr {
        /**
         * 接口返回状态错误码
         */
        SUCCESS(2000, "请求成功"),
        PERMISSION_DENIED(2001, "无权限"),
        EMPTY_PARAM(2002,"参数为空");

        private Integer value;
        private String msg;

        ApiErr(Integer value, String msg) {
            this.value = value;
            this.msg = msg;
        }

        public Integer getCode() {
            return value;
        }
        public String getMsg(){return msg;}

    }
}
