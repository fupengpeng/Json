package com.jiudianlianxian.thread;

public class Bank {
	
    private int account = 100;

    public int getAccount() {
        return account;
    }

    /**
     * 用同步方法实现
     * 
     * @param money
     */
    public synchronized void save(int money) {
        account += money;
    }

    /**
     * 用同步代码块实现
     * 
     * @param money
     */
    public void save1(int money) {
        synchronized (this) {
            account += money;
        }
    }

}
