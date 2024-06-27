package com.jmd.fusercenterbackend.common;

/**
 * Created with IntelliJ IDEA.
 * User: MingDa
 * Time: 2024/6/16 016 20:08
 * File: ResultUtils
 * Description: 返回工具类
 */
public class ResultUtils {

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error (ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }
}
