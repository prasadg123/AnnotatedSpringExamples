package com.prasad.car;

import org.springframework.stereotype.Component;

import com.prasad.annot.AnotherRandomAnnotation;
import com.prasad.annot.RandomDemoAnnotation;

@Component
//@RandomDemoAnnotation
//@AnotherRandomAnnotation
public class FourCyl implements Engine{

	public int getNumberOfClinders() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String drive() {
		// TODO Auto-generated method stub
		return "Driving effectively with 4 cylinders";
	}

}
