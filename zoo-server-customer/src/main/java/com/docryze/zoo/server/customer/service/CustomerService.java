package com.docryze.zoo.server.customer.service;

import com.docryze.zoo.server.customer.beans.po.CustomerPo;
import com.docryze.zoo.server.customer.client.ScoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ScoreClient scoreClient;

    @Override
    public CustomerPo queryCustomerById(Long id) {
        CustomerPo customerPo = new CustomerPo();
        customerPo.setId(id);
        customerPo.setName("dk");
        customerPo.setAge((short)25);
        customerPo.setGender((byte)1);
        customerPo.setCreateTime(new Date());
        customerPo.setUpdateTime(new Date());

        scoreClient.queryScoreAccount(1L,1L);

        return customerPo;
    }

    @Override
    public boolean updateCustomer(Long id, CustomerPo customerPo) {
        System.out.println("updateCustomer id:" + id);

        scoreClient.updateScoreAccountByCusId(null);
        return true;
    }
}
