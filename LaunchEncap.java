class Student{
    private int id;
    private int age;
    private String name;

    //setter
    void setId(int x){
        this.id = x;
    }
    void setAge(int y){
        this.age = y;
    }
    void setName(String name){
        this.name = name;
    }

    //getter
    int getId(){
        return id;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}

public class LaunchEncap {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(150);
        st.setAge(22);
        st.setName("nomesh");
        System.out.println("data is : " + st.getId() + " " + st.getAge() + " " +
                st.getName());
    }
}
