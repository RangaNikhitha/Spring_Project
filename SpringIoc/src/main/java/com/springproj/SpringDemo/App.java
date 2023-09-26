package com.springproj.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// get Bean is responsible to give the object
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	
        Alien obj = (Alien)context.getBean("alien");
        obj.code();
      
        System.out.println(obj.getAge());
        
       
        
        
    }
}
