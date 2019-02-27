package com.docryze.zoo.server.customer.controller;

import com.docryze.zoo.server.customer.beans.po.CustomerPo;
import com.docryze.zoo.server.customer.beans.vo.CustomerVo;
import com.docryze.zoo.server.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public CustomerVo queryCustomerById(@PathVariable("id") Long id){
        CustomerPo customerPo = customerService.queryCustomerById(id);
        return CustomerVo.builder()
                .id(customerPo.getId())
                .name(customerPo.getName())
                .age(customerPo.getAge())
                .gender(customerPo.getGender())
                .createTime(customerPo.getCreateTime())
                .updateTime(customerPo.getUpdateTime())
                .build();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{id}")
    public void updateCustomer(@PathVariable("id") Long id, CustomerPo customerPo){
        customerService.updateCustomer(id, customerPo);
    }
}
