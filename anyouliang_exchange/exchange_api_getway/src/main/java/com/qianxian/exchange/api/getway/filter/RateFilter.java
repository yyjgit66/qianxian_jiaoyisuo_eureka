package com.qianxian.exchange.api.getway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.qianxian.exchange.api.getway.exception.RateLimiterException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 做限流
 * @author yyj
 */
@Component
public class RateFilter extends ZuulFilter{

    //做限流
    private static final RateLimiter RATE_LIMITER = RateLimiter.create(100);
    @Override
    public Object run() {
        if(!RateFilter.RATE_LIMITER.tryAcquire()){
            throw  new RateLimiterException();
        }
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SERVLET_DETECTION_FILTER_ORDER-1;
    }

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
}
