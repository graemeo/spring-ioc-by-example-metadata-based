package example;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

      System.out.println("###### Application Context ID: " + context.getId());
      System.out.println("###### Start Up Date: " + context.getStartupDate());
      System.out.println("###### List of Beans: " + Arrays.asList(context.getBeanDefinitionNames()));

      Wonderwoman wonderwoman = (Wonderwoman) context.getBean("wonderwoman");
      Superman superman = (Superman) context.getBean("superman");


      System.out.println("###### Superman's ability: " + superman.showAbility());

      System.out.println("###### Superman's partner in crime ability (before transformation): " + superman.showWonderwomansAbility());

      System.out.println("###### Wonderwoman's ability: " + wonderwoman.showAbility());
      wonderwoman.setAbility("Speeeeeeeeeeeeed");
      System.out.println("###### Wonderwoman's ability has been transformed to: " + wonderwoman.showAbility());

      System.out.println("###### Superman's partner in crime ability (after transformation): " + superman.showWonderwomansAbility());

   }

}
