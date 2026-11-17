import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Employee {
   int id;
   String name;
   String department;

    Employee(int id, String name, String department) {
      this.id = id;
      this.name = name;
      this.department = department;
    }

    public String toString() {
      return id + " " + name + " " + department;
    }
}

public class EmployeeDirectory {
  public static void main(String[] args) {

      // Using ArrayList
      ArrayList<Employee> list = new ArrayList<>();

      list.add(new Employee(101, "Amit", "IT"));
      list.add(new Employee(102, "Suyog", "HR"));
      list.add(new Employee(103, "Rahul", "Sales"));

      System.out.println("Employee using ArrayList:");

      Iterator<Employee> it = list.iterator();

      while (it.hasNext()) {
        System.out.println(it.next());
      }

      // Using HashSet
      HashSet<String> departments = new HashSet<>();

      departments.add("IT");
      departments.add("HR");
        departments.add("Sales");
        departments.add("IT");

        System.out.println("\nDepartments using HashSet:");

        for (String dept : departments) {
           System.out.println(dept);
        }

        // Using HashMap
        HashMap<Integer, Employee> map = new HashMap<>();

        for (Employee e : list) {
           map.put(e.id, e);
        }

        System.out.println("\nEmployee retrieved using HashMap:");
        System.out.println(map.get(102));

        // Add new employee
        Employee newEmp = new Employee(104, "Ishwari", "Finance");

        list.add(newEmp);
        map.put(newEmp.id, newEmp);

        System.out.println("\nEmployee count: " + list.size());
        System.out.println("Employee with ID 104: " + map.get(104));
    }
}