package com.vfislk.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired

	IInstrument instrument;
	@Autowired
	IInstrument getguiter;
	@Autowired
	IInstrument getviolin;

	public void performSong(String choice, String songName) {
		if (choice.equals("g")) {

			instrument.playMusic(songName);
		}
		if (choice.equals("k")) {

			instrument.playMusic(songName);
		}
		if (choice.equals("v")) {

			getviolin.playMusic(songName);
		}

	}

}
