package records;

import java.util.Objects;

public class Employee {

  private final String name;
  private final int employeeNumber;

  public Employee(String name, int employeeNumber) {
    this.name = name;
    this.employeeNumber = employeeNumber;
  }

  public String getName() {
    return name;
  }

  public int getEmployeeNumber() {
    return employeeNumber;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", employeeNumber=" + employeeNumber +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, employeeNumber);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return employeeNumber == employee.employeeNumber &&
        name.equals(employee.name);
  }
}
