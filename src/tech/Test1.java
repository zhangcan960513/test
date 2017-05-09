package tech;

import org.junit.Test;

import java.util.*;

/**
 * Created by syx on 2017/3/20.
 */
public class Test1 extends Test21{
    public static void change(int[] a) {
        a[0] = 50;
    }

    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = a;
        System.out.println(b[0]);
        change(a);

        System.out.println("b=" + b[0]);
    }

    @Test
    public void test() throws Exception{
        Set<String> s = new HashSet<>();
        s.add("张三");
        s.add("张四");
        s.add("张五");
        Set<String> b = new HashSet<>();
        s.add("独孤求败");
        s.add("西门吹雪");
        s.add("陆小凤");
        Map<String, Set<String>> name = new HashMap<>();
        name.put("小学生", s);
        name.put("小学生", b);

        Set<String> s1 = new HashSet<>();
        s.add("张三");
        s.add("张四");
        s.add("张五");
        Set<String> b2 = new HashSet<>();
        s.add("独孤求败");
        s.add("西门吹雪");
        s.add("陆小凤");
        Map<String, Set<String>> name1 = new HashMap<>();
        name.put("小学生", s);
        name.put("小学生", b);


        String[] str = new String[]{"1", "2"};
        List<String> list = Arrays.asList(str);
        list.add("3");
        System.out.println(list);
        List<String> a = new ArrayList<>();
        Test21 test1 = new Test1();
    }

}
