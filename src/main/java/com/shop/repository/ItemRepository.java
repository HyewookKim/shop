package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>, ItemRepositoryCustom {

	List<Item> findByItemNm(String itemNm);
	List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
	List<Item> findByPriceLessThan(Integer price);
	List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
	

}

