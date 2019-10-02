package com.petfamily.service;

import com.github.pagehelper.PageInfo;
import com.petfamily.common.ServerResponse;
import com.petfamily.pojo.Shipping;

/**
 * Created by chen on 2019/3/22.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId,Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
