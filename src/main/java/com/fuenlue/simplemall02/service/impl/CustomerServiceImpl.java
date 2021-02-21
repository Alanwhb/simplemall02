package com.fuenlue.simplemall02.service.impl;

import com.fuenlue.simplemall02.entity.Customer;
import com.fuenlue.simplemall02.mapper.CustomerMapper;
import com.fuenlue.simplemall02.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 福恩略
 * @since 2021-02-21
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
