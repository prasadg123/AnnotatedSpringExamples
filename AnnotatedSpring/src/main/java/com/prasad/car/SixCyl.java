package com.prasad.car;

import org.springframework.stereotype.Component;

import com.prasad.annot.RandomDemoAnnotation;

//@Component
@RandomDemoAnnotation
public class SixCyl implements Engine{

	public int getNumberOfClinders() {
		// TODO Auto-generated method stub
		return 6;
	}

	public String drive() {
		// TODO Auto-generated method stub
		return "Driving effectively with 6 cylinders";
	}

}
