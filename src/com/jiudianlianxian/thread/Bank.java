package com.jiudianlianxian.thread;

public class Bank {
	
    private int account = 100;

    public int getAccount() {
        return account;
    }

    /**
     * ��ͬ������ʵ��
     * 
     * @param money
     */
    public synchronized void save(int money) {
        account += money;
    }

    /**
     * ��ͬ�������ʵ��
     * 
     * @param money
     */
    public void save1(int money) {
        synchronized (this) {
            account += money;
        }
    }

}
