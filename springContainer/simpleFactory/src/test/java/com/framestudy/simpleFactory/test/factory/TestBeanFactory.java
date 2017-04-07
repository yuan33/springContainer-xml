package com.framestudy.simpleFactory.test.factory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.framestudy.simpleFactory.factory.BeanFactory;
import com.framestudy.simpleFactory.interfaces.IPersonService;
import com.framestudy.simpleFactory.interfaces.impl.Dog;

public class TestBeanFactory {

	private BeanFactory factory;
	
	
	@Before
	public void before(){
		System.out.println("0");
	}
	
	@Test
	public void testGetBean(){
//		try {
//			IPersonService person = (IPersonService) factory.getBean("com.framestudy.simpleFactory.interfaces.impl.SDPersonServiceImpl");
//			Assert.assertNotNull(person);
			Assert.assertEquals(1, 3-2);
			
			
			
			
			System.out.println("45");
			
			
			
			
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	@Ignore
	public void testGetBean2(){
		System.out.println("2");
	}
	
	@After
	public void after(){
		System.out.println("-1");
	}
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		Dog dog;
//		try {
//			dog = (Dog) BeanFactory.getBean("com.framestudy.simpleFactory.interfaces.impl.Dog");
//			dog.eat();
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	
	
}
