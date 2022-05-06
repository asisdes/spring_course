package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");


        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        if (myDog == yourDog ){
            System.out.println("Объекты равны");
        } else {
            System.out.println("Объекты разные");
        }
        
        System.out.println(myDog);
        System.out.println(yourDog);



    }
}
