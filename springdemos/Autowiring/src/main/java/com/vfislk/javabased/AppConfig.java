package com.vfislk.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
     public Performer getPerformer()
     {
    	 return new Performer();
     }
	@Bean
	public Guiter getGuiter() {
		return new Guiter();
	}

	@Bean@Primary
	public Keyboard getKeyboard() {
		return new Keyboard();
	}

	@Bean
	public Violin getViolin() {
		return new Violin();
	}

}
