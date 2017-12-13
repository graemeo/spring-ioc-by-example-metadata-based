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
   }

}
