package debut;
import java.util.*;

public class Inversion_de_deux_valeurs {

    public static void main(String[] args) throws Exception{
        
//https://waytolearnx.com/2020/03/permuter-deux-variables-en-java.html

/*
 * 
 * Exercice 1.6 : Inversion de 2 valeurs
Lire 2 nombres entier A et B.
Afficher la valeur de A puis la valeur de B.
Mettre le contenu de A dans B et celui de B dans A.
Afficher à nouveau la valeur de A puis la valeur de B.
 * 
 */

int a;
int b;
int temporaire;

Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir une valeur pour a");
a = scanner.nextInt();
System.out.println("veuillez saisir une valeur pour b");
b = scanner.nextInt();
System.out.println("avant permutation : "+a+"et"+b);

temporaire = a;
a=b;
b= temporaire;

System.out.println("voici les valeurs après permutation a  "+a+  "et de b  "+b);

scanner.close();

    }

}
