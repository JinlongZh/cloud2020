package com.gangu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_gangu",  //id
                r -> r.path("/guonei")  //访问 http://localhost:9527/guonei
                        .uri("http://news.baidu.com/guonei"));  //就会转发到 http://news.baidu.com/guonei

        routes.route("path_route_gangu2",  //id
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji"));

        return routes.build();
    }

}
