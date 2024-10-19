import java.util.Scanner;

public class Ep8{
    
    public static void main(String[] args) {
        
        //Ep8
        //ex1
        //tab();

        //ex2
        //Minmax();

        //ex3
        //inverse();

        //ex4
        //nbrImpaire();

        //ex5
        //newTab();

        //ex6
        //tabMulti();
        
    }

    //Ep8

    //ex1
    public static void tab() {
    int[] tab = {1,2,4,6,7};
    int sum=0;
    for(int elm : tab ){
        System.err.println(elm);   
        sum +=elm;    
    }
    System.out.println("la somme d'elements est : "+sum);
    double moyenne = sum/tab.length;
    System.out.println("le moyenne est : "+moyenne);
    }

    //ex2
    public static void Minmax() {
        int[] tab = {1,2,4,6,7};
        int max = 0;
        for (int elem : tab) {
            if (max<elem) {
                max=elem;
            }
        }
        System.out.println("le max :"+max);
        int min = max;
        for (int elem : tab) {
            if(min>elem){
                min=elem;
            }
        }
        System.out.println("le Min est :"+min);
    }

    //ex3 
    public static void inverse() {
        int[] tab = {1,2,4,6,7};
        for (int i = tab.length-1; i >=0 ; i--) {
            System.out.println("l'element "+i+":"+tab[i]);
        }
    }
    
    //ex4
    public static void nbrImpaire() {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez un entier :");
            int n = sc.nextInt();
            int nbrImpaire = n*2+1;
            int carrer = nbrImpaire*nbrImpaire;
            tab[i] = carrer;
            System.out.println("L'élément " + i + " : " + nbrImpaire);
            System.out.println("le carrer de nombre est : "+ carrer);
        }
        for (int elem : tab) {
            System.out.println(elem);
        }
        sc.close();
    }


    public static void newTab() {
        int[] tab = {1,2,3,4,5};
        int[] tab2= new int[tab.length-1];

        int j=0;
        for (int i=0;i<tab.length;i++) {
            if(tab[i]==tab[1]){
                continue;
            }
            tab2[j]=tab[i];
            j++;
        }
        for (int elm : tab2) {
            System.out.println(elm);
        }
    }

    public static void tabMulti() {
        int[][] tab1={
            {2,4,5},
            {3,33,32}
        };
        int [][] tab2={
            {3},
            {3,4,5},
            {3,5},
            {3,1,0}
        };

        for (int [] elem : tab1) {
            for (int  elm : elem) {
                System.out.println("l'element de tab1 :"+ elm);
            }
        }
        for (int [] elem : tab2) {
            for (int  elm : elem) {
                System.out.println("l'element de tab2 :"+elm);
            }
        }
    }

    

}