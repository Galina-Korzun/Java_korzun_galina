package lesson4;

public class Employee  {
    String name;
    String surname;
    String patronimic;
    String email;
    long phone;
    int salary;
    int age;

    public Employee(String employeeName, String employeeSurname, String employeePatronimic, String employeeEmail, long employeePhone, int employeeSalary, int employeeAge){
        this.name = employeeName;
        this.surname = employeeSurname;
        this.patronimic = employeePatronimic;
        this.email = employeeEmail;
        this.phone = employeePhone;
        this.salary = employeeSalary;
        this.age = employeeAge;
    }
    public void getEmployee(){
        System.out.println("имя: " + name + ", фамилия: " + surname + ", отчество: " + patronimic + ", e-mail: " + email + ", телефон: " + phone + ", зарплата: " + salary + " руб " + ", возраст: " + age);
    }
}

