package com.llt.entity;

/**
 * Setter依赖注入
 *
 * @author llt
 */
public class SetterBean {

    private int i;

    private Account account;

    private User user;


    public void setI(int i) {
        this.i = i;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getI() {
        return i;
    }

    public Account getAccount() {
        return account;
    }

    public User getUser() {
        return user;
    }
}
