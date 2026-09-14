package streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamples {

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



        studentList.stream().filter(st->st.getFirstName().startsWith("A")).collect(Collectors.toList());
        List<Student> studentsA=studentList.stream().filter(sd->sd.getFirstName().startsWith("A")).collect(Collectors.toList());
    //    System.out.println(studentsA);
     //   Group The Student By Department Names
        Map<String,List<Student>> deptWiseStudent=studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName));


        Map<String, List<Student>> deptWiseStudents =   studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
     //   System.out.println(deptWiseStudents);
      //  3- Find the total count of student using stream
        long count = studentList.stream().count();
      //  System.out.println(count);
        OptionalInt max1= studentList.stream().mapToInt(Student::getAge).max();
        OptionalInt max = studentList.stream().mapToInt(Student::getAge).max();
     //   System.out.println(max.getAsInt());

     //   Find all departments names

        List<String> deptNames = studentList.stream().map(Student::getDepartmantName).distinct().collect(Collectors.toList());
      //  System.out.println(deptNames);
      //  6- Find the count of student in each department
        Map<String, Long> deptWiseStudentCounts = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        //System.out.println(deptWiseStudentCounts);
     //   Find the list of students whose age is less than 30

        List<Student> filterAge = studentList.stream().filter(st -> st.getAge() < 30).collect(Collectors.toList());
  //      System.out.println(filterAge);

    //    8- Find the list of students whose rank is in between 50 and 100
      List<Student> students = studentList.stream().filter(st->st.getRank()>50 &&st.getAge()<100 ).collect(Collectors.toList());
      //  System.out.println(students);


        //9- Find the average age of male and female students

        Map<String, Double> averageAgeBygenderwise = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(averageAgeBygenderwise);

        Map<String, Double> sadas=studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));

       // 10- Find the department who is having maximum number of students

        Map<String, Long> collect1 = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));

        Map<String, Long> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
      //  System.out.println(stringLongEntry);


       // 11- Find the Students who stays in Delhi and sort them by their names
        List<Student> delhi = studentList.stream().filter(st -> st.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
//        System.out.println(delhi);

     //   Find the average rank in all departments
        Map<String, Double> deptAverageRank = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
     //   System.out.println(deptAverageRank);

       // 13- Find the highest rank in each department

        Map<String, Optional<Student>> deptHighRankStudent = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.minBy(Comparator.comparing(Student::getRank))));

       // System.out.println(deptHighRankStudent);


        //14- Find the list of students and sort them by their rank

        List<Student> sorted = studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        System.out.println(sorted);
       // 15- Find the student who has second rank
        Student secondRankstudent = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println(secondRankstudent);



                       /*    firstNameStartWithA(list);




        groundStudentDeptWise(list);
        totalNumberStudent(list);
        maxAgeStudent(list);
        findAllDeptName(list);
        countStudentEachDept(list);*/
     //   averageAgeMaleAndFemail(list);
     //   findDeptofMaxStudent(list);
      //  findStudenStayDelhiSortByName(list);
       // findAvgRankinAllDept(list);
    //    findHighestRankAllDept(list);
      //  findListStudentSortByRank(list);
       // findSecondHighestRankStudent(list);

    }

















    private static void findSecondHighestRankStudent(List<Student> list) {
        Optional<Student> first = list.stream().sorted(Comparator.comparing(Student::getRank).reversed()).skip(1).findFirst();
        System.out.println(first.get());
    }

    private static void findListStudentSortByRank(List<Student> list) {
        List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void findHighestRankAllDept(List<Student> list) {
        Map<String, Optional<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparing(Student::getRank))));
        System.out.println(collect);
    }

    private static void findAvgRankinAllDept(List<Student> list) {
        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
        System.out.println(collect);
    }

    private static void findStudenStayDelhiSortByName(List<Student> list) {
        List<Student> delhi = list.stream().filter(s -> s.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println(delhi);
    }

    private static void findDeptofMaxStudent(List<Student> list) {
        int asInt = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).values().stream().mapToInt(Long::shortValue).min().getAsInt();
        System.out.println(asInt);
    }

    private static void averageAgeMaleAndFemail(List<Student> list) {
        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(collect);
    }

    private static void countStudentEachDept(List<Student> list) {
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println(collect);
    }

    private static void findAllDeptName(List<Student> list) {
        List<String> collect = list.stream().map(s -> s.getDepartmantName()).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void maxAgeStudent(List<Student> list) {
        OptionalInt max = list.stream().mapToInt(Student::getAge).max();
        System.out.println(max.getAsInt());
    }

    private static void totalNumberStudent(List<Student> list) {
        System.out.println(list.stream().count());
    }

    private static void groundStudentDeptWise(List<Student> list) {
        Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println(collect);
    }

    private static void firstNameStartWithA(List<Student> list) {
        List<Student> collect = list.stream().filter(s -> s.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println(collect);
    }


}
