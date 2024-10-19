import java.util.ArrayList;
import java.util.List;

public class listeArray {

    public static void main(String[] args) {

        //declaration d'une arraylist
        List<String> array = new ArrayList<>();

        //add list
        array.add("java");
        array.add("python");
        array.add("PHP");
        System.out.println(array);
        array.add(1,"Html");
        System.out.println(array);

        //remove list
        array.remove(0);
        System.out.println(array);
        array.remove("Html");
        System.out.println(array);

        //get list
        String ar= array.get(0);
        System.out.println(ar);

        //set list
        array.set(1,"CSS");
        System.out.println(array);
    }
}