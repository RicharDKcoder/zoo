package com.docryze.zoo.server.score.service;

import com.docryze.zoo.server.score.beans.po.ScoreAccountPo;
import org.springframework.stereotype.Service;

@Service
public class ScoreService implements IScoreService{
    @Override
    public ScoreAccountPo createScoreAccount(ScoreAccountPo scoreAccountPo) {
        if(scoreAccountPo == null) return null;
        //todo 不存在积分账户则新建
        if(!existScoreAccount(scoreAccountPo.getCustomerId())) {
            //todo 保存积分账户信息
            System.out.println(scoreAccountPo);
            return scoreAccountPo;
        }
        return null;
    }

    @Override
    public ScoreAccountPo queryScoreAccount(ScoreAccountPo scoreAccountPo) {
        if(scoreAccountPo == null) return null;
        //todo 查询积分账户信息
        System.out.println(scoreAccountPo);

        return scoreAccountPo;
    }

    @Override
    public ScoreAccountPo updateScoreAccountByCusId(ScoreAccountPo scoreAccountPo) {
        if(scoreAccountPo == null) return null;
        //todo 更新积分账户状态
        System.out.println(scoreAccountPo);

        return scoreAccountPo;
    }

    /**
     * 判断是否存在积分账户
     * @param customerId
     * @return
     */
    private boolean existScoreAccount(Long customerId) {
        if(customerId == null) return false;
        return false;
    }
}
