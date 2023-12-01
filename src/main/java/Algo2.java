import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algo2 {

    public static void main(String[] args) {
        String[] names1 = {"Kasun", "Nuwan", "Ruwan", "Supun"};
        String[] names2 = {"Amith", "Nuwan", "Yasendra", "Nissanka", "Kasun", "Nuwan"};

        HashSet<String> nameSet1 = Sets.newHashSet(names1);
        HashSet<String> nameSet2 = Sets.newHashSet(names2);
        Sets.SetView<String> intersection = Sets.intersection(nameSet1, nameSet2);
        System.out.println(intersection);
        Sets.SetView<String> difference1 = Sets.difference(nameSet1, nameSet2);
        System.out.println(difference1);
        Sets.SetView<String> difference2 = Sets.difference(nameSet2, nameSet1);
        System.out.println(difference2);
        Sets.SetView<String> difference3 = Sets.symmetricDifference(nameSet1, nameSet2);
        System.out.println(difference3);
        Set<List<String>> cartesianProduct = Sets.cartesianProduct(nameSet1, nameSet2);
        System.out.println(cartesianProduct);
        Set<Set<String>> nameSet1PowerSet = Sets.powerSet(nameSet1);
        System.out.println(nameSet1PowerSet);
        Set<Set<String>> nameSet2PowerSet = Sets.powerSet(nameSet2);
        System.out.println(nameSet2PowerSet);
        Sets.SetView<String> union = Sets.union(nameSet1, nameSet2);
        System.out.println(union);
    }
}
