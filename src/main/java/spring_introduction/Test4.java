package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.server.reactive.ContextPathCompositeHandler;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        myDog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");
        myDog.say();
        System.out.println("myDog created, name: "+ myDog.getName());
        System.out.println("yourDog created, name: "+ yourDog.getName());

        context.close();

    }
}
