package streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamples2 {

    public static void main(String[] args) {

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




        List<Student> list=studentList.stream().filter(st->st.getFirstName().startsWith("A")).collect(Collectors.toList());
        Map<String, List<Student>> studentMap=studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
         System.out.println(studentMap);






     //   Set<Student> startWithANames = studentList.stream().filter(emp -> emp.getFirstName().startsWith("A")).collect(Collectors.toSet());
     //   System.out.println(startWithANames);

        //Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
      //  System.out.println(collect);

       // long count = studentList.stream().count();
       // System.out.println(count);

        //OptionalInt collect = studentList.stream().mapToInt(emp->emp.getAge()).max();
        //System.out.println(collect);
     //   List<String> collect = studentList.stream().map(emp -> emp.getFirstName()).distinct().collect(Collectors.toList());
       // System.out.println(collect);

    //    Map<String, Long> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
      //  System.out.println(collect);
     //      Set<Student> startWithANames = studentList.stream().filter(emp -> emp.getAge()<30).collect(Collectors.toSet());
       //   System.out.println(startWithANames);

         //     Set<Student> startWithANames = studentList.stream().filter(emp -> emp.getRank()>50&&emp.getRank()<100).collect(Collectors.toSet());
          //System.out.println(startWithANames);


      //  Map<String, Double> collect = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
     //   System.out.println(collect);

      //  Map<String, Long> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
       // Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //System.out.println(stringLongEntry);

     //   Map<String, Long> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
     //   Optional<Map.Entry<String, Long>> first = collect.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).findFirst();

      //  System.out.println(first);
        //System.out.println(stringLongEntry);


     //   List<Student> students = studentList.stream().filter(emp -> emp.getCity().equalsIgnoreCase("Karnataka")).sorted(Comparator.comparing(Student::getFirstName)).toList();
     //   System.out.println(students);

    //    Map<String, Double> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
     //   System.out.println(collect);

    //    Map<String, Optional<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparing(Student::getRank))));
     //   System.out.println(collect);

       // List<Integer> students = studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).map(emp->emp.getRank()).toList();

      //  System.out.println(students);

        List<Integer> first = studentList.stream().sorted(Comparator.comparing(Student::getRank)).map(e->e.getRank()).toList();

        System.out.println(first);
    }

}
