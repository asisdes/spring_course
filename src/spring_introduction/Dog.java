package spring_introduction;

public class Dog implements  Pet{

    public Dog() {

        System.out.println("Dog bean is created");

    }

    @Override
    public void say(){

        System.out.println("Bow-wow");

    }

    public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }
}
