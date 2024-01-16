package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(20);
        ar.add(5);
        ar.add(0);
        ar.add(3);
        ar.add(10);
        ar.add(15);

        System.out.println("Before sorting : "+ar);

        //using stream api
       List<Integer> l = ar.stream().sorted().collect(Collectors.toList());
       System.out.println(l);
    }
}
