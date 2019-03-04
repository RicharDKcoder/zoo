package com.docryze.zoo.server.score.controller;

import com.docryze.zoo.server.score.beans.po.ScoreAccountPo;
import com.docryze.zoo.server.score.beans.vo.ScoreAccountVo;
import com.docryze.zoo.server.score.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
    @Autowired
    private IScoreService scoreService;


    /**
     * 创建积分账户
     * @param scoreAccountVo
     */
    @PostMapping(value = "/scores")
    public ScoreAccountVo createScoreAccount(@RequestBody ScoreAccountVo scoreAccountVo){
        if(scoreAccountVo == null) return null;
        ScoreAccountPo scoreAccountPo = new ScoreAccountPo();
        scoreAccountPo.setSumIn(scoreAccountVo.getSumIn());
        scoreAccountPo.setSumOut(scoreAccountVo.getSumOut());
        scoreAccountPo.setAmount(scoreAccountVo.getAmount());
        scoreAccountPo.setStatus(scoreAccountVo.getStatus());
        scoreAccountPo.setCustomerId(scoreAccountVo.getCustomerId());
        scoreAccountPo =  scoreService.createScoreAccount(scoreAccountPo);
        return ScoreAccountVo.builder()
                .id(scoreAccountPo.getId())
                .customerId(scoreAccountPo.getCustomerId())
                .amount(scoreAccountPo.getAmount())
                .sumIn(scoreAccountPo.getSumIn())
                .sumOut(scoreAccountPo.getSumOut())
                .status(scoreAccountPo.getStatus())
                .createTime(scoreAccountPo.getCreateTime())
                .updateTime(scoreAccountPo.getUpdateTime())
                .build();
    }

    /**
     * 查询用户积分信息
     * @param customerId
     * @return
     */
    @GetMapping("/scores")
    public ScoreAccountVo queryScoreAccount(@RequestParam("id")Long id, @RequestParam("customerId") Long customerId){

        ScoreAccountPo scoreAccountPo = new ScoreAccountPo();
        scoreAccountPo.setId(id);
        scoreAccountPo.setCustomerId(customerId);
        scoreAccountPo = scoreService.queryScoreAccount(scoreAccountPo);
        return ScoreAccountVo.builder()
                .id(scoreAccountPo.getId())
                .customerId(scoreAccountPo.getCustomerId())
                .amount(scoreAccountPo.getAmount())
                .sumIn(scoreAccountPo.getSumIn())
                .sumOut(scoreAccountPo.getSumOut())
                .status(scoreAccountPo.getStatus())
                .createTime(scoreAccountPo.getCreateTime())
                .updateTime(scoreAccountPo.getUpdateTime())
                .build();
    }

    /**
     * 更新积分账户 并返回新账户信息
     * @param scoreAccountVo  +加 -减
     * @return
     */
    @PutMapping("/scores")
    public ScoreAccountVo updateScoreAccountByCusId(@RequestBody ScoreAccountVo scoreAccountVo){
        ScoreAccountPo scoreAccountPo = new ScoreAccountPo();
        scoreAccountPo.setSumIn(scoreAccountVo.getSumIn());
        scoreAccountPo.setSumOut(scoreAccountVo.getSumOut());
        scoreAccountPo.setAmount(scoreAccountVo.getAmount());
        scoreAccountPo.setStatus(scoreAccountVo.getStatus());
        scoreAccountPo.setCustomerId(scoreAccountVo.getCustomerId());
        scoreAccountPo = scoreService.updateScoreAccountByCusId(scoreAccountPo);
        return ScoreAccountVo.builder()
                .id(scoreAccountPo.getId())
                .customerId(scoreAccountPo.getCustomerId())
                .amount(scoreAccountPo.getAmount())
                .sumIn(scoreAccountPo.getSumIn())
                .sumOut(scoreAccountPo.getSumOut())
                .status(scoreAccountPo.getStatus())
                .createTime(scoreAccountPo.getCreateTime())
                .updateTime(scoreAccountPo.getUpdateTime())
                .build();
    }
}
