package com.zeecle.taotao.service.impl;

import com.zeecle.taotao.dao.TbItemMapper;
import com.zeecle.taotao.pojo.TbItem;
import com.zeecle.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sdnware on 18-7-27.
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}
