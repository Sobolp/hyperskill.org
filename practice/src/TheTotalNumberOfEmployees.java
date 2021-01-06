import java.util.*;
import java.util.stream.Collectors;

/**
 * Let's say you are developing employee management system for your company. It has two classes:
 * <p>
 * Employee with the fields name (String) and salary (Long)
 * Department with the fields name (String), code (String), and employees (List<Employee>).
 * Both classes have getters for all fields with the corresponding names (getName(), getSalary(), getEmployees() and so on).
 * <p>
 * Using Stream API, implement a method that calculates the total number of employees with salary >= threshold
 * for all departments whose code starts with the string "111-" (without ""). Perhaps, the flatMap method can help you to implement it.
 * <p>
 * Important. Use the given template for your method. Pay attention to type of an argument and the returned value.
 * Please, use only Stream API without loops.
 * <p>
 * Examples: there are 2 departments (in JSON notation) below and threshold = 20 000.
 * The result is 1 (because there is only one suitable employee).
 * <p>
 * [
 * {
 * "name": "dep-1",
 * "code": "111-1",
 * "employees": [
 * {
 * "name": "William",
 * "salary": 20000
 * },
 * {
 * "name": "Sophia",
 * "salary": 10000
 * }
 * ]
 * },
 * {
 * "name": "dep-2",
 * "code": "222-1",
 * "employees": [
 * {
 * "name": "John",
 * "salary": 50000
 * }
 * ]
 * }
 * ]
 */
public class TheTotalNumberOfEmployees {
    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold   is lower edge of salary
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(department -> department.getCode().startsWith("111-"))
                .map(department -> department.getEmployees().stream()
                        .filter(employee -> employee.getSalary() >= threshold)
                        .count())
                .reduce(0L, (sum, n) -> sum + n).intValue();
    }

    // Don't change the code below
    static class Employee {
        private final String name;
        private final Long salary;

        Employee(String name, Long salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public Long getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    static class Department {
        private final String name;
        private final String code;
        private final List<Employee> employees;

        Department(String name, String code, List<Employee> employees) {
            this.name = name;
            this.code = code;
            this.employees = employees;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public List<Employee> getEmployees() {
            return employees;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", code='" + code + '\'' +
                    ", employees=" + employees +
                    '}';
        }
    }
}
