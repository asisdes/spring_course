package spring_introduction;

public class Person {
    private Pet pet;


    public Person(Pet pet){

        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("В класс персон добавили животное");
        this.pet = pet;
    }
}
