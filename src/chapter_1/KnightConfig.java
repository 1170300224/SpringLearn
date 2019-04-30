package chapter_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig 
{
	
	@Bean
	public Knight Kinght()
	{
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest()
	{
		return new SlayDragonQuest(System.out);
	}
}
