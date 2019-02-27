package com.docryze.zoo.server.customer.service;

import com.docryze.zoo.server.customer.beans.po.CustomerPo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerService implements ICustomerService {
    @Override
    public CustomerPo queryCustomerById(Long id) {
        CustomerPo customerPo = new CustomerPo();
        customerPo.setId(id);
        customerPo.setName("dk");
        customerPo.setAge((short)25);
        customerPo.setGender((byte)1);
        customerPo.setCreateTime(new Date());
        customerPo.setUpdateTime(new Date());

        return customerPo;
    }

    @Override
    public void updateCustomer(Long id, CustomerPo customerPo) {
        System.out.println("updateCustomer id:" + id);
    }
}
