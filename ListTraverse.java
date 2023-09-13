import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListTraverse {
    public static void main(String[] args) {

        List<String> listStr = new ArrayList<>();
        listStr.add("Nomesh");
        listStr.add("Pratik");
        listStr.add("Shreyas");
        listStr.add("raju");
        listStr.add("Shagun");

        //1.simple loop (used for indexed collection)
        System.out.println("___For-Loop___");
        for (int i=0; i<=listStr.size()-1; i++){
            System.out.println(listStr.get(i));
        }

        System.out.println("+++++++++++++++++++++");

        //2.enhanced for loop ie for-each(standard method and used everywhere)
        System.out.println("___Enhanced-For___");
        for(String str : listStr){
            System.out.println(str);
        }
        System.out.println("+++++++++++++++++++++");

        //3.using Iterator--Only Forward dirn
        System.out.println("___Iterator___");
        Iterator<String> itr = listStr.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element);
        }
        System.out.println("+++++++++++++++++++");

        //4. ListIterator--forward and Backward dirn
        System.out.println("FORWARD ListIterator");
        ListIterator<String> listItr = listStr.listIterator();
        while(listItr.hasNext()){
            String next = listItr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++");

        System.out.println("REVERSE List Iterator");
        ListIterator<String> listItr2 = listStr.listIterator(listStr.size());
        while(listItr2.hasPrevious()){
            String prevs = listItr2.previous();
            System.out.println(prevs);
        }
        System.out.println("+++++++++++++++++++++");

        //5.ForEach
        System.out.println("___ForEach___");
        listStr.forEach((element) ->{
            System.out.println(element);
        });
        System.out.println("++++++++++++++++++");
    }

}
