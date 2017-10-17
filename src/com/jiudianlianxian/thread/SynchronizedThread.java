package com.jiudianlianxian.thread;

public class SynchronizedThread {

    class NewThread implements Runnable {
        private Bank bank;

        public NewThread(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // bank.save1(10);
                bank.save(10);
                System.out.println(i + "�˻����Ϊ��" + bank.getAccount());
            }
        }

    }

    /**
     * �����̣߳������ڲ���
     */
    public void useThread() {
        Bank bank = new Bank();
        NewThread new_thread = new NewThread(bank);
        System.out.println("�߳�1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();
        
        
        System.out.println("�߳�2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
        
    }

    
    
    public static void main(String[] args) {
    	
        SynchronizedThread st = new SynchronizedThread();
        
        st.useThread();
    }


}
