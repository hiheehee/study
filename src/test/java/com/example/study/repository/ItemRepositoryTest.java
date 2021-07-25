package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import java.time.LocalDateTime;
import java.util.Optional;

import com.example.study.model.enumclass.ItemStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemRepositoryTest extends StudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {
        Item item = new Item();
        item.setStatus(ItemStatus.UNREGISTERED);
        item.setName("삼성 노트북");
        item.setTitle("삼성 노트북 A100");
        item.setContent("2019년형 삼성 노트북 입니다.");
        item.setBrandName("삼성");
        item.setRegisteredAt(LocalDateTime.now());
        item.setCreatedAt(LocalDateTime.now());
        item.setCreatedBy("Partner01");
        // item.setPartnerId(1L); -> Long to Partner

        Item newItem = itemRepository.save(item);
        Assert.assertNotNull(newItem);
    }

    @Test
    public void read() {
        Long id = 1L;

        Optional<Item> item = itemRepository.findById(id);
        Assert.assertTrue(item.isPresent());

    }


}