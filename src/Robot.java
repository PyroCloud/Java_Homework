public class Robot {
    public static void main(String[] args) {
        Robot Bumble = new Robot("Bumble", 19, 24);
        Robot Decepticon = new Robot("Arco", 21, 20);
        System.out.println(Bumble.fight(Decepticon));
    }
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower(){
        return this.power;
    }
    public boolean fight(Robot robot2){
        return this.power > robot2.power;
    }
}
