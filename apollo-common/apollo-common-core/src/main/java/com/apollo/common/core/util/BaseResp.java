package com.apollo.common.core.util;

import com.apollo.common.core.constant.CommonConstants;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回信息主体
 *
 * @author 73955
 * @date 2019/4/29 19:32
 */
@Data
public class BaseResp<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code = CommonConstants.SUCCESS;

    private String msg = "success";

    private T data;

    public BaseResp() {
    }

    public BaseResp(T data) {
        this.data = data;
    }

    public BaseResp(T data, String msg) {
        this.data = data;
        this.msg = msg;
    }

    public BaseResp(Throwable e) {
        this.msg = e.getMessage();
        this.code = CommonConstants.FAIL;
    }
}
