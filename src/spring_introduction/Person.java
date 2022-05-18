package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String name;
    private int age;


    // @Autowired
    // public Person(Pet pet){
    //     this.pet = pet;
    // }

    //public Person(){
    //  System.out.println("Person created");
    //}

    public void callYourPet() {
        System.out.println("Hello my lovely Pet");
        pet.say();
    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("В класс персон добавили животное");
        this.pet = pet;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
