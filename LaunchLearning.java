class Employee{
    int id;
    String name;

    void learn(){
        System.out.println("An employee learn everyday");
    }
    void takeBreak(){
        System.out.println("An employee always needs a break");
    }
}

public class LaunchLearning {
    public static void main(String args[]){
        System.out.println("Hello");
        Employee emp = new Employee();

        emp.learn();
        emp.takeBreak();
    }
}
