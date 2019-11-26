package com.kgc.dao;

import com.kgc.domain.Items;

public interface ItemsDao {
    Items findById(int id);
    void addItems(Items items);
}
