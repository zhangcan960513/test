class ArrayUtil {//单利:保证你哪里调用 都是得到同一个对象
    private static ArrayUtil instance = new ArrayUtil();

    //1.防止手动new对象出来
    private ArrayUtil() {
    }

    public static ArrayUtil getInstance() {
        return instance;
    }
    //排序调用
    public static void sort(int[] arr)
    {
        int[] abc = new int[]{1,2,5,6,4};
        System.out.println(abc);
    }

}


class SingletonDemo {
    public static void main(String[] args) {
        //ArrayUtil arrayUtil = new ArrayUtil();
        //ArrayUtil arrayUtil2 = new ArrayUtil();
        //System.out.println(arrayUtil.equals(arrayUtil2));
        //System.out.println(arrayUtil);
        //System.out.println(arrayUtil2);

        System.out.println(ArrayUtil.getInstance());
        //ArrayUtil.getInstance().sort(null);
        //ArrayUtil.getInstance().sort(null);
        test2 test2 = new test2();
        test2.test();

    }
}

class test2 {
    public void test() {
        System.out.println(ArrayUtil.getInstance());
    }

}
