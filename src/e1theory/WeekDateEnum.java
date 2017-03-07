/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 下午1:00:17 
 * @author malitao
 * @version 
 */
package e1theory;

/** 
 *  使用JDK5.0中提供的枚举特性
 * 创建日期：2015年12月31日 下午1:00:17 
 * @author malitao
 */
/**
 * 枚举的应用
 * 存储每周中的天份
 */
public enum WeekDateEnum {

	MON {
		
		@Override
		public WeekDateEnum nextDay() {
			return TUES;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return SUN;
		}
		
	},  TUES {
		
		@Override
		public WeekDateEnum nextDay() {
			return WEDNES;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return MON;
		}
		
	},  WEDNES {
		
		@Override
		public WeekDateEnum nextDay() {
			return THURS;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return TUES;
		}
		
	},  THURS {
		
		@Override
		public WeekDateEnum nextDay() {
			return FRI;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return WEDNES;
		}
		
	},  FRI {
		
		@Override
		public WeekDateEnum nextDay() {
			return SATUR;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return THURS;
		}
		
	},  SATUR {
		
		@Override
		public WeekDateEnum nextDay() {
			return SATUR;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return FRI;
		}
		
	},  SUN {
		
		@Override
		public WeekDateEnum nextDay() {
			return SATUR;
		}
		
		@Override
		public WeekDateEnum preDay() {
			return MON;
		}
		
	};

	private WeekDateEnum() {}
	
	/**
	 * 下一天
	 * @return
	 */
	public abstract WeekDateEnum nextDay();
	
	/**
	 * 前一天
	 * @return
	 */
	public abstract WeekDateEnum preDay();
	
	/**
	 * 枚举对象公共的toString方法，可以在case块中反馈自己想要返回的信息
	 */
	public String toString() {
		switch (this) {
		case MON:
			return "WeekDateEnum.MON";
		case TUES:
			return "WeekDateEnum.TUES";
		case WEDNES:
			return "WeekDateEnum.WEDNES";
		case THURS:
			return "WeekDateEnum.THURS";
		case FRI:
			return "WeekDateEnum.FRI";
		case SATUR:
			return "WeekDateEnum.SATUR";
		case SUN:
			return "WeekDateEnum.SUN";
		default:
			return null;
		}
	}
}
