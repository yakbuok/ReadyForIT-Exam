package d3;
import java.util.ArrayList;

class Main{
    public static void main(String[]args){
        Job coder = new SoftwareEngineer();

        coder.salary(8000);
        coder.startShift("85:80");
        coder.endShift("77:80");

        //  creating persons

        Person person = new Person();
        person.name ="John";
        person.age =28;

        Person person2 = new Person();
        person2.name ="chuol";
        person2.age = 28;

        coder.hirePerson(person);
        coder.hirePerson(person2);

        coder.printJobDescription();
        coder.printWorkers();

        Job driver = new TaxiDriver();


        driver.startShift("85:80");
        driver.endShift("77:80");
        driver.salary(1000);

        driver.printJobDescription();

        driver.hirePerson(person);



    }
}

public class Person {

    public String name;
    public int age;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

