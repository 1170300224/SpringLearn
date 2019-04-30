package chapter_2.soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main 
{
	
	public static void main(String[] args)
	{
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(chapter_2.soundsystem.config.CDPlayerConfig.class);
		
		CDPlayer player = context.getBean(CDPlayer.class);
		player.play();
		
		context.close();
	}
	
}
