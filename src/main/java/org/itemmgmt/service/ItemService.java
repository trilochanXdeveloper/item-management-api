package org.itemmgmt.service;

import org.itemmgmt.exception.ItemNotFoundException;
import org.itemmgmt.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemService {

    private final Map<Long, Item> itemStore = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    // Add new item
    public Item addItem(Item item) {
        Long id = idGenerator.getAndIncrement();
        item.setId(id);
        itemStore.put(id,item);
        return item;
    }

    // Get item by ID
    public Item getItemById(Long id){
        Item item = itemStore.get(id);
        if (item == null) {
            throw new ItemNotFoundException(id);
        }
        return item;

    }
}
