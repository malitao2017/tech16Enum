/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 下午2:08:47 
 * @author malitao
 * @version 
 */
package e2use.EnumDemoFour;

/** 
 *  
 * 创建日期：2015年12月31日 下午2:08:47 
 * @author malitao
 */

public class EnumConstantTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EnumConstant[] allday = EnumConstant.values();
		System.out.println("-----------for begin------------------");
		for (EnumConstant day : allday)
		{
			System.out.println("  name ： " + day.name());//枚举变量的名称
			System.out.println("  ordinal ： " + day.ordinal());//枚举变量的序号
			System.out.println("  ： " + day);//就是toString()的返回值
			System.out.println("  key ： " + day.getKey());//取得第一个参数
			System.out.println("  value ： " + day.getValue());//取得第二个参数
		}
		System.out.println("-----------for end------------------");
		System.out.println(EnumConstant.WEEK_00);//就是toString()的返回值
		System.out.println(EnumConstant.WEEK_01);//就是toString()的返回值
		System.out.println(EnumConstant.WEEK_02);//就是toString()的返回值
		System.out.println(EnumConstant.WEEK_03);//就是toString()的返回值		
	}

}
