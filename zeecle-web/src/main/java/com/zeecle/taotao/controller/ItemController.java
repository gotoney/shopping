package com.zeecle.taotao.controller;


import com.zeecle.taotao.pojo.TbItem;
import com.zeecle.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdnware on 18-7-27.
 */
@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "item/{itemId}")
    public TbItem getItemById(@PathVariable long itemId) {
        TbItem item = itemService.getItemById(itemId);
        return item;
    }

}
