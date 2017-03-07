/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 下午1:26:08 
 * @author malitao
 * @version 
 */
package e2use;

/** 
 * Java枚举类型的案例一
 *  由此说明定义枚举类型其实就是在定义一个类，只不过很多细节由编译器帮你补齐了，所以，某种程度上enum关键词的作用就像是class或interface.当使用enum定义枚举类型时，实际上所定义出来的类型是继承自java.lang.Enum类。而每个被枚举的成员其实就是定义的枚举类型的一个实例，它们都被默认为final。无法改变常数名称所设定的值，它们也是public和static的成员，这与接口中的常量限制相同。可以通过类名称直接使用它们。
 * 创建日期：2015年12月31日 下午1:26:08 
 * @author malitao
 */
public class EnumDemoTwo
{
	public enum ColorSelect
	{
		red, green, yellow, blue;
	}
	public static void main(String[] args) 
	{
		/*
	    * 枚举类型是一种类型，用于定义变量，以限制变量的赋值 赋值时通过"枚举名.值"来取得相关枚举中的值
	    */
	    ColorSelect m = ColorSelect.blue;
	    switch (m) 
	    {
	        /*注意:枚举重写了ToString(),说以枚举变量的值是不带前缀的
	        * 所以为blue而非ColorSelect.blue
	        */
	    	case red:
	            System.out.println("color is red");
	            break;
	        case green:
	            System.out.println("color is green");
	            break;
	        case yellow:
	            System.out.println("color is yellow");
	            break;
	        case blue:
	            System.out.println("color is blue");
	            break;
	        }
	        System.out.println("遍历ColorSelect中的值");
	        /*通过values()获得枚举值的数组*/
	        for (ColorSelect c : ColorSelect.values()) 
	        {
	            System.out.println(c);
	        }
	        System.out.println("枚举ColorSelect中的值有："+ColorSelect.values().length+"个");
	        /*ordinal()返回枚举值在枚举中的索引位置，从0开始*/
	        System.out.println(ColorSelect.red.ordinal());//0
	        System.out.println(ColorSelect.green.ordinal());//1
	        /*name()返回枚举值在枚举中的索引位置，从0开始*/
	        System.out.println(ColorSelect.yellow.name());//yellow
	        System.out.println(ColorSelect.blue.name());//blue
	        /*枚举默认实现了java.lang.Comparable接口,-1之前，0位置相同，1之后*/ 
	        System.out.println(ColorSelect.red.compareTo(ColorSelect.green));
	        /*静态valueOf()方法可以让您将指定的字符串尝试转换为枚举类型*/ 
	        ColorSelect red=ColorSelect.valueOf("red");
	        System.out.println(red);
	        System.out.println(red.getClass());
	}
}
