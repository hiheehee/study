package com.example.study.repository;

import com.example.study.model.entity.Item;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

public class ItemRepositoryTest {
    // Dependency Injection (DI)
    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {
        Item item = new Item();
        item.setName("노트북");
        item.setPrice(BigDecimal.valueOf(100000));
        item.setContent("삼성 노트북");

        Item newItem = itemRepository.save(item);

        Assert.assertNotNull(newItem);
    }

    @Test
    public void read(){
        Optional<Item> item = itemRepository.findById(1L);
        Assert.assertTrue(item.isPresent());

        item.ifPresent(selectItem -> {
            System.out.println("item"+selectItem);
        });

    }
}
