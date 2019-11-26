package com.kgc.service;

import com.kgc.domain.Items;

public interface ItemsService {
    Items findById(int id);
    void addItem(Items items);
}
