import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

class  CombinationDemo
{	
	private ArrayUtil util = new ArrayUtil();

	public void test()
	{	
		int[] arr = {5,9,7,2,6,4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr);
	}
	public static void main(String[] args) 
	{
		CombinationDemo c = new CombinationDemo();
		c.test();
	}
}
