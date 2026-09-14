package streamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public  class Test {

    public static void main(String[] args) {
        List<Employee22> employees = List.of(
                new Employee22(1, "Raj", 50000, List.of(new Address("Pune", "MH"), new Address("Mumbai", "MH"))),
                new Employee22(2, "Amit", 75000, List.of(new Address("Delhi", "DL"))),
                new Employee22(3, "Priya", 60000, List.of(new Address("Bangalore", "KA"),new Address("Delhi", "DL")))
        );
        List<Employee22> puneEmployees = employees.stream()
                .filter(e -> e.getAddresses().stream()
                        .anyMatch(a -> a.getCity().equalsIgnoreCase("Pune"))).collect(Collectors.toList());
        System.out.println(puneEmployees.toString());

        employees.stream().flatMap(e -> e.getAddresses().stream()).map(Address::getCity).distinct().forEach(System.out::println);

        Map<String, Long> empCountPerCity = employees.stream()
                .flatMap(e -> e.getAddresses().stream().map(Address::getCity))
                .peek(e-> System.out.println("City: " + e))
                .collect(Collectors.groupingBy(city -> city, Collectors.counting()));

        empCountPerCity.forEach((city, count) -> System.out.println(city + " -> " + count));



    }


}