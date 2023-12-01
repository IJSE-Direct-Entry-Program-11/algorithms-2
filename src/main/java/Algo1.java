import java.util.HashSet;
import java.util.Set;

public class Algo1 {

    public static void main(String[] args) {
        String[] names1 = {"Kasun", "Nuwan", "Ruwan", "Supun"};
        String[] names2 = {"Amith", "Nuwan", "Yasendra", "Nissanka", "Kasun", "Nuwan"};

        Set<String> commonNames = new HashSet<>();
        for (String n1 : names1) {
            for (String n2 : names2) {
                if (n1.equals(n2)) commonNames.add(n1);
            }
        }

        System.out.println(commonNames);
    }
}
