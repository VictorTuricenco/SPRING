package spring_introduction;

public class Person {

    private Pet pet;
    private int age;
    private String surname;

    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person() {
        System.out.println("Person constructor");
    }

    public void setPet(Pet pet) {
        System.out.println("Pet is set");
        this.pet = pet;
    }

    public void callYourPet (){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
