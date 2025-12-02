public class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        
        return Integer.hashCode(age);
    }

    @Override
    public String toString() {
        return "Player[name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Player p1 = new Player("Sam", 25);
        Player p2 = new Player("Alex", 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("Same hashCode? " + (p1.hashCode() == p2.hashCode()));
    }
}
