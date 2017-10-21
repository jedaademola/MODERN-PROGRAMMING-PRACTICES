import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Employee> empList(int start, int end)
    {
        List<Employee> empList = new ArrayList<>();
        for(int i = start; i <= end; ++i)
        {
            int tempAge = i%2 == 0? i + 1: i -1;

            Employee e = new Employee();
            e.setAge(tempAge);
            e.setName("Employee " + i);

            empList.add(e);
        }

        return empList;
    }
}
