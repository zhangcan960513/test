package tech;

import org.junit.Test;

/**
 * Created by syx on 2017/3/21.
 */
public  class Test21 implements Testttt {

    @Override
    public void test() throws Exception {

    }
}

class Bbbb extends Test21 {
    @Test
    public void test() {
        Test21 bbbb = new Bbbb();

    }
}
