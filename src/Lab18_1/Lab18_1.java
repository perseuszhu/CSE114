package Lab18_1;

import java.util.ArrayList;
import java.util.Comparator;

public class Lab18_1 {
    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> fin = (ArrayList<String>) lst1.clone();
        fin.addAll(lst2);
        fin.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1.toLowerCase();
                String s2 = o2.toLowerCase();
                return s1.compareTo(s2);
            }
        });
        return fin;
    }

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add("Austin");
        city.add("Dallas");
        city.add("San Francisco");
        System.out.println("List1 has its elements: " + city);
        ArrayList<String> city2 = new ArrayList<String>();
        city2.add("Boston");
        city2.add("Chicago");
        city2.add("Denver");
        city2.add("Seattle");
        System.out.println("List2 has its elements: " + city);
        ArrayList<String> city3 = mergeList(city,city2);
        System.out.println("Merged and sorted list3 has its elements: " + city3);


    }
}
