package streamApi;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamLamdaExaple {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {

        List<Student> studentList = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));


        List<String> list=Arrays.asList("Java","Lamda","Kafka");

//        Runnable r= ()->{
//                System.out.println("helo");
//        };
       // new Thread(r).start();
//      list.stream().sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::println);
//        list.stream().sorted((s1,s2)->s1.compareTo(s2)).forEach(e->{
//            System.out.println(e);
//        });

        list.stream().sorted(Comparator.comparingInt(e1->e1.length())).forEach(System.out::println);

        Caculate add=(a,b)->a+b;
        Caculate mod=(a,b)->a*b;

       ;
        mod.caculate(10,2);
        System.out.println("add" +add.caculate(10, 2)+"mul"+mod.caculate(1, 2));

        Map<String,String> text=new HashMap<>();
        text.put("A", "A");
        text.forEach((k,v)->System.out.println(k+v));

        Predicate<String> p=s->s.length()>0;
        p.test("asa");

        BiFunction<Integer,Integer,Integer> bi=(s1,s2)->(s1+s2);
        bi.apply(10, 1);

        Consumer c=(s)->System.out.println(s);
        c.accept("asdas");

        Supplier s=()->"";
        s.get();

         String test="java is awesome";
        String eachWordReverse = Arrays.stream(test.split(" ")).map(map -> new StringBuilder(map).reverse()).collect(Collectors.joining(" "));


        String collect = Arrays.stream(test.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
            Collections.reverse(e);
            return e.stream();
        })).collect(Collectors.joining(" "));
        System.out.println(collect);


        String reverseWork=Arrays.stream(test.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(),e->{
            Collections.reverse(e);
            return e.stream();})).collect(Collectors.joining( " "));
        System.out.println(reverseWork);


        String collect1 = Arrays.stream(test.split(" ")).map(e -> new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect1);
        List<Integer> numer=Arrays.asList(1,2,3,4);

        Integer reduce = numer.stream().reduce(0, (s1, s2) -> s1 * s2);

        String reduce1 = Arrays.stream(test.split(" ")).reduce("", (s1, s2) -> s2 + " " + s1);
        System.out.println(reduce1);

        numer.stream().mapToInt(Integer::intValue).max();

        Arrays.stream(test.split(" ")).mapToInt(e->e.length()).forEach(System.out::print);

        Map<String, Long> collect2 = Arrays.stream(test.split(" ")).collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()));

        Map<Boolean, List<Integer>> collect3 = numer.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect3);
        List<String> list1=Arrays.asList("Java","Lamda","Kafka");
        list1.stream().collect(Collectors.counting());

        IntSummaryStatistics collect4 = numer.stream().collect(Collectors.summarizingInt(Integer::intValue));



        List<Employee1> empList = Arrays.asList(
                new Employee1(1, "Rohit",  "Mechanical Engineering", 2015, "Mumbai"),
                new Employee1(2, "Pulkit",  "Computer Engineering", 2018, "Delhi"));

        empList.stream().max(Comparator.comparingInt(Employee1::getSalary));

        empList.stream().sorted(Comparator.comparingInt(Employee1::getSalary)).map(Employee1::getName).collect(Collectors.toList());

            empList.stream().mapToInt(Employee1::getSalary).sum();

            empList.stream().mapToInt(Employee1::getSalary).average();

            empList.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.summingInt(Employee1::getSalary)));

            String s1="TEST";
        Map<Character, Long> collect5 = s1.chars().mapToObj(c1 -> (char) c1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect5);

        char[] chars = "asda".toCharArray();
    }



}




class Employee1 {
    private int id;
    private String name;
    private String department;
    private int salary;
    private String city;

    public Employee1(int id, String name, String department, int salary, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Constructor, Getters, Setters, toString
}
