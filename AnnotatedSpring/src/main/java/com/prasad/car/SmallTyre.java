package com.prasad.car;

import org.springframework.stereotype.Component;

import com.prasad.annot.RandomDemoAnnotation;

//@Component
@RandomDemoAnnotation
public class SmallTyre implements Tyre{

	public String getTyreDiameter() {
		// TODO Auto-generated method stub
		return "The tyre is 1 inch diameter";
	}

}
