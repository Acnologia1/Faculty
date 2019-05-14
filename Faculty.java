package Lession4;

public class Faculty extends Employee{
    public Faculty(){
        System.out.println("Faculty performing its tasks1");
    }
    public static void main(String[] args){
        new Faculty();
    }

}
class Employee extends Person{
    public Employee(){
        //Dung this de hiển thị (String s
        this("Employee overloading its tasks2");
        System.out.println("Employee performing its tasks3");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
class Person{
    public Person(){
        System.out.println("Person performing its task4");
    }
}