package com.prasad.AnnotatedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.prasad.car.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext=new FileSystemXmlApplicationContext("appContext.xml");
        
        Car car=appContext.getBean("car",Car.class);
        
        System.out.println("The car description is as follows: "+car.getCarDescripton());
        
        ((FileSystemXmlApplicationContext)appContext).close();
    }
}
