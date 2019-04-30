package chapter_2.soundsystem;

import org.springframework.stereotype.Component;

@Component("Ahh")
public class AhhCD implements CompactDisc {

	private String title = "Ahh";
	private String artist = "szt";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
