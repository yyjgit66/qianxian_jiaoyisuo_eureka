package com.qianxian.module.service.controller;

import com.qianxian.module.fegin.TestSeataFegin;
import io.seata.core.context.RootContext;
import io.seata.core.exception.TransactionException;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.tm.api.GlobalTransactionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    @Autowired
    private TestSeataFegin testSeataFegin;
    @GetMapping("hello")
    @GlobalTransactional
    public String hello(){
        testSeataFegin.save();

//        try{
//            int i = 1 / 0;
//        }catch(Exception e){
//            try {
//                GlobalTransactionContext.reload(RootContext.getXID()).rollback();
//            } catch (TransactionException ex) {
//                ex.printStackTrace();
//            }
//            System.out.println("1111");
//        }
        return "hello";

    }
}
