package util;

/**
 * @author : liu.qingqing
 * @date : 2021-02-24
 * @description :ThreadLocal 一个线程内 不同方法内的参数传递 每个线程都有自己本地变量副本
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> t = new ThreadLocal();
        System.out.println("主线程:"+Thread.currentThread().getName());
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.set(Thread.currentThread().getName());
                System.out.println("线程一:"+t.get());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.set(Thread.currentThread().getName());
                System.out.println("线程二:"+t.get());            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.set(Thread.currentThread().getName());
                System.out.println("线程三:"+t.get());            }
        }).start();
    }
}
