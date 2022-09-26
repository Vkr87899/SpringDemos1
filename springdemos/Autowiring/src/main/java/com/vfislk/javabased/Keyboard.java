package com.vfislk.javabased;

import org.springframework.stereotype.Component;

//@Component
public class Keyboard implements IInstrument {

	@Override
	public void playMusic(String songName) {
		System.out.println("playing " + songName + " with Keyboard");
		// TODO Auto-generated method stub

	}

}
