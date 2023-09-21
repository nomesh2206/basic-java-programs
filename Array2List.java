import java.util.ArrayList;
import java.util.List;

public class Array2List {
    public static void main(String[] args) {
        String DBDA[] = {"Java", "SQL", "Python", "Analytics", "MachineLearning", "AWS", "BigData", "Visualization"};

        List<String> list = new ArrayList<>();

        for(String x : DBDA){
            list.add(x);
        }

        System.out.println(list);
    }
}
