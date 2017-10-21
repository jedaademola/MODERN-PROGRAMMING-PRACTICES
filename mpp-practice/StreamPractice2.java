import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice2 {

    public static Stream<Character> characterStream(String s) {
        List<Character> result = new ArrayList<>();
        for (char c : s.toCharArray())
            result.add(c);
        return result.stream();
    }


    public static void main(String args[]) {


        List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
        Stream<String> longestFirst
                = words.stream().
                sorted(
                        (String x, String y) -> (new Integer(y.length()).compareTo(new Integer(x.length()))));

        System.out.println(longestFirst.collect(Collectors.toList()));
        //OPTION 2
        Stream<String> longestFirst2
                = words.stream().sorted(Comparator.comparing(String::length).reversed());
        System.out.println(longestFirst2.collect(Collectors.toList()));


        Stream<Character> combined =
                Stream.concat(characterStream("Hello"),
                        characterStream("World"));

        List<Character> xters = combined
        .collect(Collectors.toList());
        //.forEach(c ->System.out.print(c));

        System.out.println();
        System.out.println(xters);
        System.out.println();


        List<Employee> empList = Employee.empList(25, 30);

        //System.out.println(empList);

        empList.forEach( e -> System.out.println(e));
        //PERSON
        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));
        long count = persons.stream()
                .count();

        System.out.println("Number of Person:" + count);

        long countEmp = empList.stream()
                .count();

        System.out.println("Number of Employee:" + countEmp);
        System.out.println("sorted list");
        List<Employee> newEmpList =  empList.stream()
          .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))

         // .sorted(Comparator.comparing(Employee::getName))
                 .sorted((s1, s2) ->{
                     if (s1.getAge() > s2.getAge()) return 1;
                     if(s1.getAge() < s2.getAge()) return -1;
                     return 0;
                 })


        .collect(Collectors.toList());

        newEmpList.forEach( e -> System.out.println(e));
    }
    /*

    .sorted((s1, s2) ->{
             if (s1.getAge() > s2.getAge()) return 1;
             if(s1.getAge() < s2.getAge()) return -1;
             return 0;
         })
     */
}
