package com.docryze.zoo.server.score.beans.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 积分账户流水表
 */
@Setter
@Builder
@ToString
public class ScoreAccountLogVo implements Serializable {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long customerId;
    /**
     * 分值
     */
    private BigDecimal amount;
    /**
     * 类型
     * @see com.docryze.zoo.server.score.beans.constant.EScoreAccountLogType
     */
    private Short type;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
