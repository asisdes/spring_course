package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext33.xml");

        Person person = context.getBean("personBean", Person.class);
        //Cat myCat = context.getBean("cat", Cat.class);
        //myCat.say();
        person.callYourPet();

        context.close();

    }
}
