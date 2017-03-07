/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech16Enum
 * 描述信息: 
 * 创建日期：2015年12月31日 上午11:54:20 
 * @author malitao
 * @version 
 */
package e1theory;

/** 
 *  
 * 创建日期：2015年12月31日 上午11:54:20 
 * @author malitao
 */
public enum Color
{
	RED{
		public String getName(){
			return "红色";
		}
	}
	,GREEN{
		public String getName(){
			return "绿色";
		}
	}
	,YELLOW{
		public String getName(){
			return "黄色";
		}
	};
	public abstract String getName();
}
