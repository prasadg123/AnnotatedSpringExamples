package myConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prasad.car.BigTyre;
import com.prasad.car.Car;
import com.prasad.car.Engine;
import com.prasad.car.FourCyl;
import com.prasad.car.SixCyl;
import com.prasad.car.SmallTyre;
import com.prasad.car.Tyre;

@Configuration
@ComponentScan({"com.prasad.car"})
public class AppConfig {

	/*@Bean(name="smallTyre")
	public Tyre getSmallTyre() {
		return new SmallTyre();
	}
	
	@Bean(name="bigTyre")
	public Tyre getBigTyre() {
		return new BigTyre();
	}
	
	@Bean(name="fourCyl")
	public Engine getFourCyl() {
		return new FourCyl();
	}
	
	@Bean(name="bigTyre")
	public Engine getSixCyl() {
		return new SixCyl();
	}
	
	@Bean(name="car")
	public Car getMyCar() {
		return new Car();
	}
*/	
}
