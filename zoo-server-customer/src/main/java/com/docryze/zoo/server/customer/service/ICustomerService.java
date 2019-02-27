package com.docryze.zoo.server.customer.service;

import com.docryze.zoo.server.customer.beans.po.CustomerPo;

/**
 * 用户服务接口
 */
public interface ICustomerService {
    /**
     * 查询用户信息
     * @param id
     * @return
     */
    CustomerPo queryCustomerById(Long id);

    /**
     * 更新用户信息
     * @param id
     * @param customerPo
     */
    void updateCustomer(Long id, CustomerPo customerPo);
}
