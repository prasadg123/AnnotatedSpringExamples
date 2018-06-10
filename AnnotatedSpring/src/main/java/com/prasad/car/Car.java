package com.prasad.car;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.prasad.annot.AnotherRandomAnnotation;
import com.prasad.annot.RandomDemoAnnotation;

//@Component
//@RandomDemoAnnotation
//@AnotherRandomAnnotation
public class Car {
	
	private String name;

	public String getName() {
		return name;
	}

	
	@Inject
	//@Autowired
	//@Resource
	//@Required
	public void setName( @Value("This is my Car") String name) {
		this.name = name;
	}
	
	/*@Inject
	@Named("smallTyre")*/
	//@Resource(name="smallTyre")
	/*@Autowired
	@Qualifier("smallTyre")*/
	private Tyre frontLeft;

	/*@Inject
	@Named("smallTyre")*/
	//@Resource(name="smallTyre")
	/*@Autowired
	@Qualifier("smallTyre")*/
	private Tyre frontRight;

	/*@Inject
	@Named("bigTyre")*/
	//@Resource(name="bigTyre")
	/*@Autowired
	@Qualifier("bigTyre")*/
	private Tyre rearLeft;

	/*@Inject
	@Named("bigTyre")*/
	//@Resource(name="bigTyre")
	/*@Autowired
	@Qualifier("bigTyre")*/
	private Tyre rearRight;

	/*@Inject
	@Named("fourCyl")*/
	//@Resource(name="fourCyl")
	/*@Autowired
	@Qualifier("fourCyl")*/
	private Engine engineType;
	
	public Tyre getFrontLeft() {
		return frontLeft;
	}

	//@Resource(name="smallTyre")
	@Autowired
	@Named("smallTyre")
	//@Qualifier("smallTyre")
	public void setFrontLeft(Tyre frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Tyre getFrontRight() {
		return frontRight;
	}

	//@Resource(name="smallTyre")
	@Autowired
	@Named("smallTyre")
	//@Qualifier("smallTyre")
	public void setFrontRight(Tyre frontRight) {
		this.frontRight = frontRight;
	}

	public Tyre getRearLeft() {
		return rearLeft;
	}

	//@Resource(name="bigTyre")
	@Autowired
	@Named("bigTyre")
	//@Qualifier("bigTyre")
	public void setRearLeft(Tyre rearLeft) {
		this.rearLeft = rearLeft;
	}

	public Tyre getRearRight() {
		return rearRight;
	}

	//@Resource(name="bigTyre")
	@Autowired
	@Named("bigTyre")
	//@Qualifier("bigTyre")
	public void setRearRight(Tyre rearRight) {
		this.rearRight = rearRight;
	}

	public Engine getEngineType() {
		return engineType;
	}

	//@Resource(name="fourCyl")
	@Autowired
	@Named("fourCyl")
	//@Qualifier("fourCyl")
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	public Car() {
		
	}
	
	//@Autowired
	@Inject
	public Car(@Qualifier("smallTyre") Tyre frontLeft,@Qualifier("smallTyre") Tyre frontRight,@Qualifier("bigTyre") Tyre rearLeft,@Qualifier("bigTyre") Tyre rearRight,@Qualifier("fourCyl") Engine engineType) {
		this.frontLeft=frontLeft;
		this.frontRight=frontRight;
		this.rearLeft=rearLeft;
		this.rearRight=rearRight;
		this.engineType=engineType;
		
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("The bean is ready to go\n");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("The bean is destroyed");
	}
	public String getCarDescripton() {
		
		String description="";
		if(frontLeft!=null) description+=name+" \nFront left tyre: "+frontLeft.getTyreDiameter();
		if(frontRight!=null) description+=" \nFront right tyre: "+frontRight.getTyreDiameter();
		if(rearRight!=null) description +=" \nRear right tyre: "+rearRight.getTyreDiameter();
		if(rearLeft!=null) description +=" \nRear left tyre: "+rearLeft.getTyreDiameter();
		if(engineType!=null) description+="\nEngine type: "+engineType.getNumberOfClinders()+" and "+engineType.drive()+"\n";		
		if(description=="") description="not set";
		
		return description;
		
	}
	
}
