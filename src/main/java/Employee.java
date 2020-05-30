
public class Employee {
    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    private String fullName;
    private String  duties;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    //2. Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee (String fullName, String duties, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.duties = duties;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary= salary;
        this.age=age;
    }
    // Почему через этот метод не выводит информацию на консоль?
    static void Employee (String fullName, String duties, String email, String phoneNumber, int salary, int age) {
        System.out.println("fullName: " +  fullName +  "duties: " +  duties + "email: " + email + "phoneNumber: " + phoneNumber + "salary: " + salary + "age: " + age );
    }

    public int getAge() {
        return age;
    }

    public void  info () {
        System.out.printf("Employee1, %s, %s, %s, %s, %d,%d. %n", fullName, duties, email, phoneNumber, salary, age);

    }
}