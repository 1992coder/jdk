package lang.object;

/**
 * @author : liu.qingqing
 * @date : 2021-01-25
 * @description :
 */
public class StringBufferDemo {
    /**
     * append方法
     */
    public static void main(String[] args) {
        //StringBuffer和StringBuilder区别: StringBuffer 线程安全的,方法使用synchronized修饰
        StringBuffer sb = new StringBuffer("12345673948728498");
        sb.append("demo");
    }
}
