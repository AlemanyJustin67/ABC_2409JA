/*Exercice 4.3 : Alimenter un tableau
Écrire un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront être stockées dans un tableau.

L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. Il effectuera ensuite cette saisie. Enfin, une fois la saisie terminée, le programme affichera le nombre de valeurs négatives et le nombre de valeurs positives. */

import java.util.Arrays;
import java.util.Scanner;

public class partie4alimenterUnTableau {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int valeur;
    int[] tableau;
    int nombre =0;
    int positif = 0;
    int negatif = 0;

        

    System.out.println("veuillez saisir une valeur");
    valeur = scanner.nextInt();

    tableau = new int[valeur];

    for (int i = 0; i < tableau.length; i++) {
    System.out.print("entrer un nombre"+i+" du tableau");
    nombre = scanner.nextInt();
    tableau[i] = nombre;

    if (tableau[i] > 0) {
        negatif = i ;
    }

    else if (tableau[i] < 0){
        positif = i;
    }
    

   
}
System.out.println(Arrays.toString(tableau));


    // if (tableau[i] > 0) {
    //     negatif = nombre ;
    //     negatif++;
    // }

    // else if (tableau[i] < 0){
    //     positif = i;
    //     positif++; 
    // }




System.out.println("Il y a " + negatif + " valeur positif(s) ");
System.out.println("Il y a " + positif + " valeur negatif(s) ");
}

}
