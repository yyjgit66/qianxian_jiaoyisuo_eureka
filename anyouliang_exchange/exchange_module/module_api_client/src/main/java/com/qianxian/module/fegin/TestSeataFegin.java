package com.qianxian.module.fegin;

import com.qianxian.module.fegin.fallback.TestSeataFeginFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="exchangeTest")
public interface TestSeataFegin {
    @GetMapping("save")
    void save();
}
