package d3;

import java.util.ArrayList;

abstract public class OfficeJob implements  Job{

    int salary;
    String startShift;
    String endShift;

    ArrayList<Person> people;

    public OfficeJob(){
        people = new ArrayList<Person>();

    }


    @Override
    public void salary(int salary) {
        this.salary = salary;

    }

    @Override
    public void startShift(String startShift) {
        this.startShift = startShift;

    }

    @Override
    public void endShift(String endShift) {
        this.endShift = endShift;

    }

    @Override
    public void printJobDescription() {
        System.out.println("salary: " + salary);
        System.out.println("startShift: " + startShift);
        System.out.println("endShift: " + endShift);

    }

    @Override
    public void printWorkers() {
        System.out.println("People: " + people);

    }

    @Override
    public void hirePerson(Person person) {
        people.add(person);

    }

    @Override
    public void firePerson(Person person) {
        people.remove(person);

    }
}


