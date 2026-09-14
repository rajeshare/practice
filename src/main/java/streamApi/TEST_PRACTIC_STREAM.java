package streamApi;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TEST_PRACTIC_STREAM {

    public static void main(String[] args) {


        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        char aa= (char)97;
        System.out.println(aa);

        Integer collect = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(collect);

        String text="hello world";
        List<Character> collect1 = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(collect1);
        Map<Character, Long> maps=text.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(a->a,Collectors.counting()));

        Map<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(maps);


        int[] intArray={1,2,3,4,5};
        int[] intArray1={1,2,3,4,5};

        int[] res= IntStream.concat(IntStream.of(intArray),IntStream.of(intArray1)).sorted().toArray();
        System.out.println(Arrays.toString(res));
    }
}
