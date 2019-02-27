package com.docryze.zoo.server.customer.beans.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class CustomerPo implements Serializable {
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
