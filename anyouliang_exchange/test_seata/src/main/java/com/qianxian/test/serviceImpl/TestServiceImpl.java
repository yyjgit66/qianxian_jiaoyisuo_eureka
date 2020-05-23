package com.qianxian.test.serviceImpl;

import com.qianxian.test.dao.TestDao;
import com.qianxian.test.entity.TaoBaoProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl {

    @Autowired
    private TestDao testDao;

    @Transactional
    public void save(){
        TaoBaoProduct taoBaoProduct = new TaoBaoProduct();
        taoBaoProduct.setId(1L);
        taoBaoProduct.setT_index(1L);
        taoBaoProduct.setCode("01");
        testDao.save(taoBaoProduct);
    }
}
