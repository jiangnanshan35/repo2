package com.kgc.service.impl;

import com.kgc.dao.ItemsDao;
import com.kgc.domain.Items;
import com.kgc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao dao;

    public Items findById(int id) {
        return dao.findById(id);
    }

    public void addItem(Items items) {
        dao.addItems(items);
    }
}
