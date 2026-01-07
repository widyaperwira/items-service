package com.example.items.service;

import com.example.items.domain.Item;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ItemService {
    Item createItem(Item item);

    List<Item> getAllItems();

    Optional<Item> getItemById(UUID id);

    Item updateItem(UUID id, Item item);

    void deleteItem(UUID id);
}
