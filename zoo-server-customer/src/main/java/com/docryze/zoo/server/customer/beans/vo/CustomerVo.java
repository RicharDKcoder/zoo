package com.docryze.zoo.server.customer.beans.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
@Builder
public class CustomerVo {
    //主键id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Short age;
    //性别
    private Byte gender;
    //注册时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}
