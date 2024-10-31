package d3;

import java.util.ArrayList;

abstract public class OutSideJob implements Job{

    int salary;
    String startShift;
    String endShift;

    ArrayList<Person> people1;

    public OutSideJob(){
        people1 = new ArrayList<Person>();

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
        System.out.println("People: " + people1);

    }

    @Override
    public void hirePerson(Person person) {
        people1.add(person);

    }

    @Override
    public void firePerson(Person person) {
        people1.remove(person);

    }
}


