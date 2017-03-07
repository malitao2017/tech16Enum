/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 下午1:24:47 
 * @author malitao
 * @version 
 */
package e2use;

/** 
 *  运行上面的代码，将编辑产生EnumDemoOne.class和EnumDemoOne$InnerEnum.class。 
由此说明定义枚举类型其实就是在定义一个类，只不过很多细节由编译器帮你补齐了，所以，某种程度上enum关键词的作用就像是class或interface.当使用enum定义枚举类型时，实际上所定义出来的类型是继承自java.lang.Enum类。而每个被枚举的成员其实就是定义的枚举类型的一个实例，它们都被默认为final。无法改变常数名称所设定的值，它们也是public和static的成员，这与接口中的常量限制相同。可以通过类名称直接使用它们。
 * 创建日期：2015年12月31日 下午1:24:47 
 * @author malitao
 */

public class EnumDemoOne
{
	private enum InnerEnum
	{
		RED, GREEN, YELLOW
	};

	public static void main(String[] args)
	{
		System.out.println(InnerEnum.RED.getClass());
		System.out.println(InnerEnum.GREEN);
		System.out.println(InnerEnum.YELLOW);
	}
}
