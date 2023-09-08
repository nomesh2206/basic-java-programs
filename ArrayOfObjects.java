public class Student {
    public int roll_no;
    public String name;
    public String dept;
    Student(int roll_no, String name, String dept)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.dept = dept;
    }
}
public class ArrayOfObjects {
    public static void main(String args[]) {
        // declares an Array of integers.
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student(1,"Pratik","electrical");

        // initialize the second elements of the array
        arr[1] = new Student(2,"Vaibhav","vlsi");
        arr[2] = new Student(3,"Sameeer", "eee");
        arr[3] = new Student(4,"Gaurav","dance");
        arr[4] = new Student(5,"Vikas","eee");

        // accessing the elements of the specified array ie of "eee" dept
        for (int i = 0; i < arr.length; i++){
            if(arr[i].dept == "eee")
                System.out.println("Element at " + i + " : " +
                        " "+ arr[i].name + " " + arr[i].dept);
        }

    }
}
