package com.framestudy.simpleFactory.factory;

import com.framestudy.simpleFactory.interfaces.IPersonService;
import com.framestudy.simpleFactory.interfaces.impl.GDPersonServiceImpl;
import com.framestudy.simpleFactory.interfaces.impl.SCPersonServiceImpl;
import com.framestudy.simpleFactory.interfaces.impl.SDPersonServiceImpl;

/**
 * 这是一个产品工厂
 * 主要职责是：负责生产产品
 * @author Administrator
 *
 */
public class BeanFactory {

	public static Object getBean(String msg) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
	/*	IPersonService person = null;
		if(msg != null && msg.equals("SC")){
			person = new SCPersonServiceImpl();
		}else if(msg != null && msg.equals("SD")){
			person = new SDPersonServiceImpl();
		}else if(msg != null && msg.equals("GD")){
			person = new GDPersonServiceImpl();
		}*/
		Object obj = null;
		if(msg != null && !msg.equals("")){
			Class<?> cls = Class.forName(msg);
			obj = cls.newInstance();
		}
		return obj;
	}
}
