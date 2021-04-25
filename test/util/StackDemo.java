package util;

import java.util.Stack;

/**
 * @author : liu.qingqing
 * @date : 2021-01-27
 * @description :
 * 栈:先进后出
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> demo = new Stack<>();
        demo.push("1");
        demo.push("2");
        demo.push("3");
        demo.push("3");
//        System.out.println();
//        String str = demo.peek();
//        System.out.println(str);
//        System.out.println(demo.pop());
        System.out.println(demo.indexOf("3"));

    }
}
