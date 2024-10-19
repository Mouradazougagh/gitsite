
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ep9 {
    public static void main(String[] args) {
        //EP9
        //ex1
        arr();

        //ex3 
        aslist();
        
        // ex4
        ListToArray();

    }

    public static void arr() {
        //creation d'une arraylist
        List<Integer> array=new ArrayList<>();
        array.add(3);
        array.add(12);
        array.add(10);
        array.add(5);
        System.out.println(array);

        //la sum 
        int sum = 0;
        for (int elem : array) {
            sum +=elem;
        }
        System.out.println("lasomme des nombre dans la list est :"+sum);

        //les nombre paire :
        for (int elem : array) {
            if(elem%2==0){
                System.out.println("element paire : "+elem);
            }
        }

        //le plus grand element dans la liste
        int m = 0;
        for (int elem : array) {
            if (m<elem) {
                m=elem;
            }
        }
        System.out.println("le plus grand element dans la list est :"+m);

        //Créer une liste de nombres premiers
        List<Integer> nbrPremier = new ArrayList<>();
        nbrPremier.add(2);
        nbrPremier.add(3);
        nbrPremier.add(5);
        nbrPremier.add(7);
        System.out.println(nbrPremier);

        //Créer une autre liste contenant des lettres
        List<String> ch = new ArrayList<>();
        ch.add("Ahmed");
        ch.add("bilal");
        ch.add("yassin");
        ch.add("karim");
        ch.add("said");
        System.out.println(ch);

        //trier les chaines
        Collections.sort(ch);
        System.out.println(ch);

        //Fusionner les 2 listes
        nbrPremier.addAll(array);
        System.out.println(nbrPremier);


    
        
    }

    // ex3
    //Convertir un tableau de chaînes en une liste et ajouter un nouvel élément à cette liste.
    public static void aslist() {
        String [] tab = {"mourad", "karim","yassin"};
        List<String> arry =new ArrayList<>( Arrays.asList(tab));
        arry.add("kamal");
        System.out.println(arry);
    }

    //ex4
    //Convertir une List<String> en un tableau String[].
    public static void ListToArray() {
        List<String> li = new ArrayList<>();
        li.add("hello");
        li.add("java");
        li.add("spring");
        System.out.println(li);

        //la convertion 
        String [] tabb = li.toArray(new String[0]);
        for (String elem : tabb) {
            System.out.println(elem);
        }

    }
}
