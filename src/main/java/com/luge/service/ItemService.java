package com.luge.service;

import com.luge.domain.Item;
import java.util.List;

/**
 * Item类的service接口
 */
public interface ItemService {
    /**
     * 查询所有
     * @return
     */
    public List<Item> findAll();
}
