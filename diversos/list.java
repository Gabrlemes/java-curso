import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class list {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("eduarda");
        list.add("gabriel");
        list.add(2, "marcos");

        System.out.println(list.size());
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("--------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
    }
}
