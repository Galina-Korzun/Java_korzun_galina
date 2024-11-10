package lesson4;

public class Person {
        String name;
        String position;
        String email;
        String phone;
        long salary;
        int age;

        public Person(String empName, String empPosition, String empMail, String empPhone, long empSalary, int empAge) {
            this.name = empName;
            this.position = empPosition;
            this.email = empMail;
            this.phone = empPhone;
            this.salary = empSalary;
            this.age = empAge;
        }

        public void getPerson() {
            System.out.println("Сотрудник: " + name + ", должность: " + position + ", эл.адрес: " + email + ", телефон: " + phone + ", оклад: " + salary + ", возраст " + age);
        }
}
