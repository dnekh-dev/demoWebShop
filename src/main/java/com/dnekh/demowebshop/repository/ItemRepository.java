package com.dnekh.demowebshop.repository;

import com.dnekh.demowebshop.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
