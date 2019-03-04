package com.docryze.zoo.server.score.service;

import com.docryze.zoo.server.score.beans.po.ScoreAccountPo;

/**
 * 积分服务接口
 */
public interface IScoreService {
    /**
     * 创建积分账户
     * @param scoreAccountPo
     */
    ScoreAccountPo createScoreAccount(ScoreAccountPo scoreAccountPo);

    /**
     * 查询用户积分信息
     * @param scoreAccountPo
     * @return
     */
    ScoreAccountPo queryScoreAccount(ScoreAccountPo scoreAccountPo);

    /**
     * 更新积分账户 并返回新账户信息
     * @param scoreAccountPo  +加 -减
     * @return
     */
    ScoreAccountPo updateScoreAccountByCusId(ScoreAccountPo scoreAccountPo);
}
