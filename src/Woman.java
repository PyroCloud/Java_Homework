
public class Woman{
    String name, husband;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHusband(String husband){
        this.husband = husband;
    }

    public String getHusband() {
        return husband;
    }

    public static void main(String[] args) {
        Woman woman = new Woman();
        Man man = new Man();
        man.setName("Cillian");
        woman.setName("Priscilla");
        man.setWife(woman.name);
        woman.setHusband(man.name);
        System.out.println(woman.husband + " " + man.wife);
    }

}
class Man{
    String name,wife;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getWife() {
        return wife;
    }
}
