/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 上午11:56:37 
 * @author malitao
 * @version 
 */
package e1theory;

import java.lang.reflect.Modifier;

/** 
 *  该运行结果首先说明了RED和Color不是同一个类，而是前者是后者的一个子类；同时也说明了enum申明的其实是一个abstract的类，所以Color中可以有抽象方法。 

那么，我们应该这么理解枚举类型的原理，首先enum Color继承了java.lang.Enum这个抽象类，但enum Color还是一个抽象类，所以它可以有抽象方法和非抽象方法。

而enum Color中的枚举值变量RED事实上上Color的一个匿名子类，所以它可以实现Color中的抽象方法，这样，当我们调用System.out.println(Color.RED.getName());

就是调用了匿名子类实现的方法。当然这些过程的很多事都有编译器等为我们做了，所以这里的代码很简单。


 * 创建日期：2015年12月31日 上午11:56:37 
 * @author malitao
 */
public class ColorTest {
	public static void main(String[] args) {
		//打印该枚举值的名称
		System.out.println(Color.RED.getName());
		//打印该枚举值的类
		System.out.println(Color.RED.getClass());
		//打印该枚举值的类的父类
		System.out.println(Color.RED.getClass().getSuperclass());
		//打印该枚举值的类的父类的父类
		System.out.println(Color.RED.getClass().getSuperclass().getSuperclass());
		//打印该枚举类型的修饰符
		System.out.println(Modifier.toString(Color.class.getModifiers()));
	}	
	/*运行结果
	红色
	class com.lxq.enumm.Color$1
	class com.lxq.enumm.Color
	class java.lang.Enum
	public abstract*/

}
