package com.luge.service.impl;

import com.luge.dao.ItemDao;
import com.luge.domain.Item;
import com.luge.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Override
    public List<Item> findAll() {
        return itemDao.findAll();
    }
}
