package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }
}

public class StreamDemo {

    public static List<Employee> employeeList;
    public static List<Integer> integerList;

    static {
        employeeList = Arrays.asList(
                new Employee(1, "ABC", "R&D", 50000),
                new Employee(2, "EFG", "HR", 60000),
                new Employee(3, "IJK", "Finance", 30000),
                new Employee(4, "DJK", "HR", 30000),
                new Employee(1, "ABC", "R&D", 50000)
        );

        integerList = Arrays.asList(1, 2, 3, 1, 2, 4, 5);
    }

    public static void main(String[] args) {
        //increment salary of each employee by 10000
        //   incrementSalaryOfEmployee();

        //print distinct/unique employee
        //will have to override equals() and hashcode() method
        //printDistinctEmployees();

        //print employee details whose name starts with I
        //  printEmployeeWhoseNameStartsWith();

        //number of employees in each department
        //  NumberOfEmployeesInEachDepartment();

        //total salary for employees
        //  totalSalaryForEmployees();

        //avg. salary for employees
          avgSalaryForEmployees();

        //avg. salary for each department
        //  avgSalaryForEachDepartment();

        //asc sort employee list by Id
        //  ascSortEmployeesById();

        //dsc sort employee list by Id
        //   dscSortEmployeesById();

        //dsc sort employee list by name
        //   dscSortEmployeesByNameUsingSeparateComparator();

        //dsc sort employee list by name
        //  dscSortEmployeesByName();

        //------------------Integer streams-----------------

        //print unique (distinct) elements
        //  printDistinctIntegers();

        //since toSet(), unique elements
        //  printDistinctIntegersUsingSet();

        //multiple ways to sort stream
        // multipleWaysToSortIntegerStream();

    }

    private static void multipleWaysToSortIntegerStream() {
        integerList.stream()
                .sorted()
                .forEach(System.out::print);

        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

        integerList.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::print);

        integerList.stream()
                .sorted(Comparator.comparingInt(Integer::intValue))
                .forEach(System.out::print);
    }

    private static void printDistinctIntegersUsingSet() {
        integerList.stream()
                .collect(Collectors.toSet())
                .stream()
                .forEach(System.out::print);
    }

    private static void printDistinctIntegers() {
        integerList.stream()
                .distinct()
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::print);
    }

    private static void dscSortEmployeesByName() {
        employeeList.stream()
                .sorted((e1, e2) -> -e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);
    }

    private static void dscSortEmployeesByNameUsingSeparateComparator() {
        Comparator comparator = (name1, name2) -> {
            Employee emp1 = (Employee) name1;
            Employee emp2 = (Employee) name2;
            return -emp1.getName().compareTo(emp2.getName());
        };


        employeeList.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    private static void dscSortEmployeesById() {
        employeeList.stream()
                .sorted(Comparator.comparingInt(e -> -1 * e.getId()))
                .forEach(System.out::println);
    }

    private static void ascSortEmployeesById() {
        employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .forEach(System.out::println);
    }

    private static void avgSalaryForEachDepartment() {
        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));
    }

    private static void avgSalaryForEmployees() {
        System.out.println(employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary)));
    }

    private static void totalSalaryForEmployees() {
        System.out.println(employeeList.stream()
                .collect(Collectors.summingDouble(Employee::getSalary)));
    }

    private static void NumberOfEmployeesInEachDepartment() {
        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
    }

    private static void printEmployeeWhoseNameStartsWith() {
        employeeList.stream()
                .filter(employee -> employee.getName().startsWith("I"))
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
    }

    private static void printDistinctEmployees() {
        employeeList.stream()
                .distinct()
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
    }

    private static void incrementSalaryOfEmployee() {
        employeeList.stream()
                .map(employee -> employee.getSalary() + 10000)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
    }
}
