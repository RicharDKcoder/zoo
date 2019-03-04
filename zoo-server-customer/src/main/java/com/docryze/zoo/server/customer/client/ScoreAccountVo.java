package com.docryze.zoo.server.customer.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 积分账户
 */
@Getter
@Setter
@ToString
public class ScoreAccountVo implements Serializable {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 用户ID
     */
    private Long customerId;
    /**
     * 状态
     */
    private Short status;
    /**
     * 积分
     */
    private BigDecimal amount;
    /**
     * 赚取的积分总和
     */
    private BigDecimal sumIn;
    /**
     * 消耗的积分总和
     */
    private BigDecimal sumOut;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
