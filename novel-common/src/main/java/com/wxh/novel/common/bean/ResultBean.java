package com.wxh.novel.common.bean;

import com.wxh.novel.common.enums.ResponseStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.xml.ws.Response;

/**
 * 自定义Api响应结构
 * @author:wxh
 * @date:2022/8/10
 * @param <T> 相应数据类型
 **/
@Data
public class ResultBean<T> {

    @ApiModelProperty(value = "响应状态码，200表示成功")
    private int code = ResponseStatus.OK.getCode();

    /**
     * 响应消息
     */
    @ApiModelProperty(value = "响应状态消息")
    private String msg = ResponseStatus.OK.getMsg();
    /**
     * 响应中的数据
     */
    @ApiModelProperty(value = "响应数据")
    private T data;

    private ResultBean(){
    }

    private ResultBean(ResponseStatus responseStatus){
        this.code = responseStatus.getCode();
        this.msg = responseStatus.getMsg();
    }

    private ResultBean(T data){
        this.data = data;
    }
}
