package SpringLearning.test1;

public class Person2 {

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    private Pet pet;
}
