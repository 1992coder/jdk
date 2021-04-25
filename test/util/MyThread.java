package util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : liu.qingqing
 * @date : 2021-02-23
 * @description :
 */
public class MyThread implements Runnable {
//    static AtomicInteger m = new AtomicInteger(0);
    static Integer m = new Integer(0);
    @Override
    public void run() {
        for(int i=0;i<1000000;i++){
            m++;
        }
    }

    public static void main(String[] args) throws Exception{
        MyThread my = new MyThread();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.start();
        t2.start();

        Thread.sleep(500);
        System.out.println(MyThread.m);
    }
}
