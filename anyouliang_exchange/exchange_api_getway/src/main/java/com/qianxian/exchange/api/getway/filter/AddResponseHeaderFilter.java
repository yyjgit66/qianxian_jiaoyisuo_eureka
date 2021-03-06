package com.qianxian.exchange.api.getway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * 后置过滤器
 * @author yyj
 */
@Component
public class AddResponseHeaderFilter  extends ZuulFilter {
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletResponse response = requestContext.getResponse();
        response.setHeader("X-FOO", UUID.randomUUID().toString());
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER-1;
    }

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

}
