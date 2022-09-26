package com.vfislk.javabased;

import org.springframework.stereotype.Component;

//@Component
public class Guiter implements IInstrument {

	@Override
	public void playMusic(String songName) {
		System.err.println("playing " + songName + " with Guiter");

	}

}
