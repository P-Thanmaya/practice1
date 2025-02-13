package com.sample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemDAO itemdao;

    public List<Item> getAllItems() {
        return itemdao.findAll();
    }

    public void saveItem(Item item) {
        itemdao.save(item);
    }
}