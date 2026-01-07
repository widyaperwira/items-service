package com.example.items.service;

import com.example.items.domain.Item;
import com.example.items.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getItemById(UUID id) {
        return itemRepository.findById(id);
    }

    @Override
    public Item updateItem(UUID id, Item itemDetails) {
        return itemRepository.findById(id).map(item -> {
            item.setItemName(itemDetails.getItemName());
            item.setQuantity(itemDetails.getQuantity());
            item.setDescription(itemDetails.getDescription());
            return itemRepository.save(item);
        }).orElseThrow(() -> new RuntimeException("Item not found with id " + id));
    }

    @Override
    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }
}
