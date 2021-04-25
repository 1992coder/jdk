package util;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author : liu.qingqing
 * @date : 2021-01-26
 * @description :
 */
public class ArrayListDemo {
    /**
     * add() 方法:
     * (1)判断是否需要扩容
     *    1)默认 defaultCapacity = 10; size+1 < defaultCapacity 追加到 elementData[size++]=e;
     *    2)size+1 > defaultCapacity 则执行 3)grow方法
     *    3)newCapacity = element.len + element.len << 1,newCapacity 与 max(size + 1,defaultCapacity) 取 大的值 ,扩容
     * (2)elementData[size++]=e
     *
     * 线程不安全:
     * (1)会出现数组下标越界异常
     * (2)值覆盖 elementData[size++]=e 分为两部操作 elementData[size]=e;size++;
     * @param args
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("深圳");
        list1.add("广州");
        list1.add("杭州");
        list1.add("武汉");

        ListIterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            String element = iterator.next();
            System.out.println("Index=" + index + ", Element=" + element);
        }
        while(iterator.hasPrevious()){
            int index = iterator.previousIndex();
            String value = iterator.previous();
            System.out.println("index:"+index + "value:"+value);
        }
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("33");
//        list1.add("44");


    }
}
