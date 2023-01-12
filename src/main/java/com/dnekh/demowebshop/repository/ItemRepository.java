package com.dnekh.demowebshop.repository;

import com.dnekh.demowebshop.models.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Items, Long> {
}
