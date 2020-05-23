package com.qianxian.module.fegin.fallback;

import com.qianxian.module.fegin.TestSeataFegin;
import org.springframework.stereotype.Component;

@Component
public class TestSeataFeginFallback implements TestSeataFegin {
    @Override
    public void save() {
        System.out.println("太拥挤了，请稍后再试！！！");
    }
}
