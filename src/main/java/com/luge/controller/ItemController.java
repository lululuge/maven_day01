package com.luge.controller;

import com.luge.domain.Item;
import com.luge.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Item的控制类
 */
@Controller
@RequestMapping(path = "/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "/findAll")
    public String findAll(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<Item> items = itemService.findAll();
        model.addAttribute("items", items);
        return "list";
    }
}
