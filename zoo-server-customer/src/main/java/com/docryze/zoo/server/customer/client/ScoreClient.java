package com.docryze.zoo.server.customer.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-server-score")
public interface ScoreClient {
    /**
     * 创建积分账户
     * @param scoreAccountVo
     */
    @RequestMapping(method = RequestMethod.POST, value = "/stores", consumes = "application/json")
    ScoreAccountVo createScoreAccount(@RequestBody ScoreAccountVo scoreAccountVo);

    /**
     * 查询用户积分信息
     * @param id
     * @param customerId
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/scores")
    ScoreAccountVo queryScoreAccount(@RequestParam("id")Long id, @RequestParam("customerId") Long customerId);

    /**
     * 更新积分账户 并返回新账户信息
     * @param scoreAccountVo  +加 -减
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/scores", consumes = "application/json")
    ScoreAccountVo updateScoreAccountByCusId(ScoreAccountVo scoreAccountVo);
}
