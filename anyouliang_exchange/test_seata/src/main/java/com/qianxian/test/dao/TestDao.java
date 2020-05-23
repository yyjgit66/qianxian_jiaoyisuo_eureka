package com.qianxian.test.dao;

import com.qianxian.test.entity.TaoBaoProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestDao extends JpaRepository<TaoBaoProduct,Long> {
}
