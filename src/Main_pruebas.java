public class Main_pruebas {
    public static void main(String[] args){
        Animal dog = new Dog();

        dog.swim();
        dog.play();
    }

}

interface Swimmer{
    void swim();
}

interface Player{
    void play();
}
abstract class Animal implements Swimmer,Player{

}
class Dog extends Animal{
    public void swim(){
        System.out.println("Dog is swimming");
    }
    public void play(){
        System.out.println("Dog is playing");
    }
}