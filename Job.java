package d3;

public interface Job {

    void salary(int salary);
    void startShift(String shift);
    void endShift(String shift);
    void printJobDescription();// print the salary and other data we have
    void printWorkers();
    void hirePerson(Person person);
    void firePerson(Person person);



}
