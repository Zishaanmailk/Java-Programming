import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");

      
        names.remove("Charlie");

      
        System.out.println(names);
    }
}
