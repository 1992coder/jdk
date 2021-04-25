package util;

import java.util.LinkedList;

/**
 * @author : liu.qingqing
 * @date : 2021-01-27
 * @description :
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        linkedList.add(1,"4");
    }
}
