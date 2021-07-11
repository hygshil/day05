package com.hp.bean;

public class Manage {
    private String account,password,mname;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }
}
