package chapter_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args)
	{	
		ClassPathXmlApplicationContext context = getXmlContext();
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		
		context.close();
	}
	
	public static ClassPathXmlApplicationContext getXmlContext()
	{
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext(
							"chapter_1/knights.xml");
			return context;
	}
	
	public static AnnotationConfigApplicationContext getJavaConfigContext()
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(KnightConfig.class);
		return context;
	}
	
}








