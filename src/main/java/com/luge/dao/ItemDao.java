package com.luge.dao;

import com.luge.domain.Item;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Item的dao接口
 */
@Repository
public interface ItemDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from items")
    public List<Item> findAll();
}
