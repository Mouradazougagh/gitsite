import java.util.Scanner;

public class TP1 {
    
    public static void main(String[] args) {
        
        // tp1
        tp1();
    }

    public static void tp1() {
        Scanner ssc = new Scanner(System.in);

        // a
        System.out.println("combien d'étudiants vous souhaitez ajouter");
        int nbrEtu = ssc.nextInt();

        // b
        String [] tabEtu = new String[nbrEtu];

        // c 
        Double [] tabEtuNote = new Double[nbrEtu];

        //4 
        for (int i = 0; i <nbrEtu; i++) {
            System.out.println("saisir le nom d'etudient :");
            String name = ssc.nextLine();
            tabEtu[i]=name;
        }
        
        for (String elem : tabEtu) {
            System.out.println(elem);
        }

        //

        for (int i = 0; i <nbrEtu; i++) {
            System.out.println("saisir la note d'etudient :");
            double note = ssc.nextDouble();
            if(note<=20 && note>=0){
                tabEtuNote[i]=note;
            }
        }


        // la moyenne de la classe
        int sum=0;
        for (double elm : tabEtuNote) {
            sum+=elm;     
        }
        double moyenne = sum/tabEtuNote.length;
        System.out.println("le moyenne de la classe est : "+moyenne);

        //Utilisez une boucle et des conditions pour afficher les noms des étudiants ayant des notes supérieures à la moyenne
        for (int i = 0; i < nbrEtu; i++) {
            if(tabEtuNote[i]>=moyenne){
                System.out.println("le nom : "+tabEtu[i]+" la note :"+tabEtuNote[i]);
            }
        }
        ssc.nextLine();
        // Demandez à l'utilisateur le nom d'un étudiant       
        System.out.println("saisir le nom d'etudient que vous avez:");
        String NomEtu = ssc.nextLine();



        //Cherchez et affichez la note de cet étudiant ou un message d'erreur si l'étudiant n'est pas trouvé.
        try {

            for (int i = 0; i < nbrEtu; i++) {
                if(tabEtu[i].equals(NomEtu)){
                    System.out.println("la note de "+tabEtu[i]+" est : "+tabEtuNote[i]);
                }
            }
            
        } catch (Exception e) {
            System.out.println("on a pas trouver l'etudient");
        }


        
        ssc.close();
    }
    
    
}
