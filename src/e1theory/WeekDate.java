/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 下午12:59:44 
 * @author malitao
 * @version 
 */
package e1theory;

/** 
 *  最后再附上网上一个使用Java普通类模拟枚举的例子http://blog.csdn.net/xyang81/article/details/7185428，这个例子真的很好。 
使用Java普通类模拟枚举
 * 创建日期：2015年12月31日 下午12:59:44 
 * @author malitao
 */
import java.util.HashMap;
import java.util.Map;

/**
 * 模拟星期中的表示的天，每个星期天都表示一个对象
 * 1、类中的每一个枚举成员都是该类的一个实例对象
 * 2、构造函数私有化
 * 3、提供操作枚举成员的抽象方法和静态方法
 */
public abstract class WeekDate {
	/**
	 * 星期一
	 */
	public static final WeekDate MON = new WeekDate("MON",0) {//匿名子类
		@Override
		public WeekDate nextDay() {
			return TUES;
		}
		@Override
		public WeekDate preDay() {
			return SUN;
		}
		@Override
		public String toString() {
			return "WeekDate.MON";
		}
	};	
	
	/**
	 * 星期二
	 */
	public static final WeekDate TUES = new WeekDate("TUES",1) {
		@Override
		public WeekDate nextDay() {
			return WEDNES;
		}
		@Override
		public WeekDate preDay() {
			return MON;
		}
		@Override
		public String toString() {
			return "WeekDate.TUES";
		}
	};
	
	/**
	 * 星期三
	 */
	public static final WeekDate WEDNES = new WeekDate("WEDNES",2) {
		@Override
		public WeekDate nextDay() {
			return THURS;
		}
		@Override
		public WeekDate preDay() {
			return TUES;
		}
		@Override
		public String toString() {
			return "WeekDate.WEDNES";
		}	
	};
	
	/**
	 * 星期四
	 */
	public static final WeekDate THURS = new WeekDate("THURS",3) {
		@Override
		public WeekDate nextDay() {
			return FRI;
		}
		@Override
		public WeekDate preDay() {
			return WEDNES;
		}		
		@Override
		public String toString() {
			return "WeekDate.THURS";
		}		
	};
	
	/**
	 * 星期五
	 */
	public static final WeekDate FRI = new WeekDate("FRI",4){
		@Override
		public WeekDate nextDay() {
			return SATUR;
		}
		@Override
		public WeekDate preDay() {
			return THURS;
		}
		@Override
		public String toString() {
			return "WeekDate.FRI";
		}
	};
	
	/**
	 * 星期六
	 */
	public static final WeekDate SATUR = new WeekDate("SATUR",5){
		@Override
		public WeekDate nextDay() {
			return SUN;
		}
		@Override
		public WeekDate preDay() {
			return FRI;
		}		
		@Override
		public String toString() {
			return "WeekDate.SATUR";
		}		
	};
	
	/**
	 * 星期日
	 */
	public static final WeekDate SUN = new WeekDate("SUN",6){
		@Override
		public WeekDate nextDay() {
			return MON;
		}
		@Override
		public WeekDate preDay() {
			return SATUR;
		}
		@Override
		public String toString() {
			return "WeekDate.SUN";
		}
	};
	
	private static Map<String, WeekDate> valueMap = new HashMap<String, WeekDate>();
	
	/**
	 * 枚举名称
	 */
	private final String name;
	
	/**
	 * 枚举成员的顺序
	 */
	private final int ordinal;
	
	private WeekDate(String name,int ordinal) {
		this.name = name;
		this.ordinal = ordinal;
	}
	
	/**
	 * 保存枚举成员
	 */
	private static WeekDate[] values = {
		MON,TUES,WEDNES,THURS,FRI,SATUR,SUN
	};
	
	//初始化
	static {
		valueMap.put("MON", values[0]);
		valueMap.put("TUES", values[1]);
		valueMap.put("WEDNES", values[2]);
		valueMap.put("THURS", values[3]);
		valueMap.put("FRI", values[4]);
		valueMap.put("SATUR", values[5]);
		valueMap.put("SUN", values[6]);
	}
	
	/**
	 * 下一天
	 * @return
	 */
	public abstract WeekDate nextDay();
	
	/**
	 * 前一天
	 * @return
	 */
	public abstract WeekDate preDay();
	
	/**
	 * 枚举中的所有成员
	 * @return
	 */
	public static WeekDate[] values() {
		return values;
	}
	
	/**
	 * 将一个字符串转换成一个枚举成员对象
	 * @param name 枚举名称
	 * @return 枚举对象
	 */
	public static WeekDate valueOf(String name) {
		if (name.equalsIgnoreCase("MON")) {
			return MON;
		} else if (name.equalsIgnoreCase("TUES")) {
			return TUES;
		} else if (name.equalsIgnoreCase("WEDES")) {
			return WEDNES;
		} else if (name.equalsIgnoreCase("THURS")) {
			return THURS;
		} else if (name.equalsIgnoreCase("FRI")) {
			return FRI;
		} else if (name.equalsIgnoreCase("SATUR")) {
			return SATUR;
		} else if (name.equalsIgnoreCase("SUN")) {
			return SUN;
		} else {
			throw new IllegalArgumentException("找不到" + name + "枚举类型！");
		}
	}
	
	/**
	 * 优化字符串转枚举对象
	 * @param name 枚举名称
	 * @return 枚举对象
	 */
	public static WeekDate valueOf_2(String name) {
		WeekDate value = valueMap.get(name.toUpperCase());
		if (value == null) {
			throw new IllegalArgumentException("找不到" + name + "枚举类型！");
		}
		return value;
	}
	public String getName() {
		return name;
	}
	public int getOrdinal() {
		return ordinal;
	}
}