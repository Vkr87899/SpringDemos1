package com.vfislk.javabased;

import org.springframework.stereotype.Component;

//@Component
public class Violin implements IInstrument {

	@Override
	public void playMusic(String songName) {
		System.err.println("playing "+songName +" with Violin");

	}

}
