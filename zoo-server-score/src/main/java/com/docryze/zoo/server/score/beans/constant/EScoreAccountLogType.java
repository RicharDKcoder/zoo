package com.docryze.zoo.server.score.beans.constant;

import lombok.Getter;
import lombok.ToString;

/**
 * 积分账户流水类型
 */
@Getter
@ToString
public enum EScoreAccountLogType {
    ;
    Short value;
    String desc;

    EScoreAccountLogType(Short value, String desc){
        this.value = value;
        this.desc = desc;
    }
}
