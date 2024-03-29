package com.sdsoon.router;

import com.sdsoon.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * RouterFunctions 对请求路由处理类，即将请求路由到处理器，这里将一个 GET 请求 /hello 路由到处理器 cityHandler 的 helloCity 方法上。跟 Spring MVC 模式下的 HandleMapping 的作用类似。
 * <p>
 * RouterFunctions.route(RequestPredicate, HandlerFunction) 方法，对应的入参是请求参数和处理函数，如果请求匹配，就调用对应的处理器函数。
 * <p>
 * Created By Chr on 2019/4/16/0016.
 */
@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> routerUser(UserHandler userHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")//get请求，也有post请求
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        userHandler::hello)
                .andRoute(RequestPredicates.GET("/post")
                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON_UTF8)),
                        userHandler::post);


    }


}
