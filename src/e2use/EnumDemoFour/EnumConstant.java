/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 下午2:07:32 
 * @author malitao
 * @version 
 */
package e2use.EnumDemoFour;

/** 
 * Java枚举类型的案例三
案例三在二的基础上增加了构造时的参数个数，使得这样的枚举有更广泛的用处。

 *  PS：我常把Light叫做枚举类型，把其中的RED等叫做枚举变量或枚举值。
本以为RED只是一个Light类的一个static final的实例而已。但后然发现不是这样的，所以文中相关表述不正确的已加中划线，
正确的枚举类型原理见下一篇，Java学习整理系列之Java枚举类型的原理http://blog.csdn.net/sup_heaven/article/details/35559117

 * 创建日期：2015年12月31日 下午2:07:32 
 * @author malitao
 */

public enum EnumConstant
{
	WEEK_00("", "请选择"),WEEK_01("01", "周一"), WEEK_02("02", "周二"), WEEK_03("03", "周三");
	private String key;
	private String value;
	//自定义的构造函数，参数数量，名字随便自己取
	//构造器默认也只能是private, 从而保证构造函数只能在内部使用 
	private EnumConstant(String key, String value)
	{
		this.key = key;
		this.value = value;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}
	//重新toString方法，默认的toString方法返回的就是枚举变量的名字，和name()方法返回值一样
	@Override
	public String toString()
	{
		return this.key+":"+this.value;
		
	}

}
