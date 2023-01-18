import java.io.IOException;

public class Human {
    public static void main(String[] args) {
        Human man = new Human();
        man.name = "Dan";
        Human woman = new Human();
        woman.name = "Lily";
        Human boy = new Human();
        boy.name = "Lance";
        Human girl = new Human();
        girl.name = "Priscilla";
        boy.father = man;
        boy.mother = woman;
        girl.father = man;
        girl.mother = woman;
        System.out.println(man.toString());


    }
    private String name;
    boolean gender;
    int age;
    Human father, mother;
    @Override
    public String toString() {

        return "Name : " + name;// + ". Father: " + father.name + ". Mother: " + mother.name;

    }
}

