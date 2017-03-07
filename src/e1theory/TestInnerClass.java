/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 上午11:58:17 
 * @author malitao
 * @version 
 */
package e1theory;

/** 
 * 要是你不明白上面打印的内容，我再提供一个普通的类给你看看，还是类似的效果哦。
 * 匿名子类的模式
 * 创建日期：2015年12月31日 上午11:58:17 
 * @author malitao
 */
public abstract class TestInnerClass {

	public abstract void dosomething();
	public static void main(String[] args) {
		TestInnerClass tic = new TestInnerClass() {
			
			@Override
			public void dosomething() {
				System.out.println("我是匿名子类");
			}
		};
		tic.dosomething();
		System.out.println(tic.getClass());
	}
	/*输出结果
	我是匿名子类
	class e1theory.TestInnerClass$1
	*/
}
