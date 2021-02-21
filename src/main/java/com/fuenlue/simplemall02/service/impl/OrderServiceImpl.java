package com.fuenlue.simplemall02.service.impl;

import com.fuenlue.simplemall02.entity.Order;
import com.fuenlue.simplemall02.mapper.OrderMapper;
import com.fuenlue.simplemall02.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
