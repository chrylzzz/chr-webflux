package com.sdsoon.controller;

import com.sdsoon.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created By Chr on 2019/4/16/0016.
 */
@RestController
@RequestMapping("/flux")
public class FluxController {

    @RequestMapping("/query")
    public Flux<UserBean> query() {

        UserBean userBean = new UserBean();
        userBean.setUserName("Chr");
        userBean.setPassWord("123");
        return userBean;
    }

    @RequestMapping("/query3")
    public Mono<UserBean> query3() {

        UserBean userBean = new UserBean();
        userBean.setUserName("Chr");
        userBean.setPassWord("123");
        return Mono.just(userBean);
    }

    @RequestMapping("/query2")
    public UserBean query2() {

//        WebClient

        UserBean userBean = new UserBean();
        userBean.setUserName("Chr");
        userBean.setPassWord("123");
        return userBean;
    }
}
