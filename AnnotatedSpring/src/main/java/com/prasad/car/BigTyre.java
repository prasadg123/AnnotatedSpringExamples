package com.prasad.car;

import org.springframework.stereotype.Component;

import com.prasad.annot.AnotherRandomAnnotation;
import com.prasad.annot.RandomDemoAnnotation;

//@Component
//@RandomDemoAnnotation
//@AnotherRandomAnnotation
public class BigTyre implements Tyre{

	public String getTyreDiameter() {
		// TODO Auto-generated method stub
		return "The tyre is 16 inch diameter";
	}

	
}
