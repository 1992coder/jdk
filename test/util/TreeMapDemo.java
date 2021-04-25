package util;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author : liu.qingqing
 * @date : 2021-02-22
 * @description :TreeMap测试类
 */
public class TreeMapDemo {

    public static void main(String[] args) {//key必须实现Comparable接口(String或者Integer)
//        Map<String,String> map = new TreeMap<>();
//        map.put("one","demo1");
//        map.put("ane","demo2");
//        map.put("tna","demo2");
//        System.out.println(map);

        Map<Student,Integer> maptwo = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()==o2.getAge()){
                    return 0;
                }
                return o1.getAge()>o2.getAge()?1:-1;
            }
        });
        Student s1 = new Student("one",1);

        Student s2 = new Student("two",2);

        maptwo.put(s1,1);
        maptwo.put(s2,2);

        System.out.println(maptwo);
    }


}

class Student {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


}
