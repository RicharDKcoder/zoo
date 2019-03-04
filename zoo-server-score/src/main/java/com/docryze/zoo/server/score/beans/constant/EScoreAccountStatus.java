package com.docryze.zoo.server.score.beans.constant;

import lombok.Getter;
import lombok.ToString;

/**
 * 积分账户状态
 */
@Getter
@ToString
public enum EScoreAccountStatus {
    FROZEN((short)0,"冻结"),
    USABLE((short)1,"可用");
    public Short value;
    public String desc;

    EScoreAccountStatus(Short value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static EScoreAccountStatus build(Short status){
        switch (status){
            case 0:
                return EScoreAccountStatus.FROZEN;
            case 1:
                return EScoreAccountStatus.USABLE;
            default:
                return null;
        }
    }

}
