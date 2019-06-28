package com.sdsoon.bean;

import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;

/**
 * Created By Chr on 2019/4/16/0016.
 */
public class UserBean extends Flux<UserBean> {

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    @Override
    public void subscribe(CoreSubscriber<? super UserBean> actual) {

    }
}
