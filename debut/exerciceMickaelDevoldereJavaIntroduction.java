package debut;
import java.util.Scanner; // importation de la classe java.util.Scanner 
import java.util.Date; // importation de la classe java.util.date
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.time.LocalDate;

public class exerciceMickaelDevoldereJavaIntroduction {
    public static void main(String[] args) throws Exception{

//Exercice algorithme à faire aujourd'hui. Correction collective demain.

//Implémenter le programme suivant : 

//## Déroulement du programme

//1. Le programme demande à l'utilisateur de saisir un nom et un prénom.
//      - L’utilisateur saisit un nom et un prénom.

String nom;
String prénom;
Scanner scanner;

scanner = new Scanner(System.in);

System.out.println("   Saisissez votre nom");

nom = scanner.nextLine();

System.out.println("   Saisissez votre prénom");

prénom = scanner.nextLine();

System.out.println(" "+prénom+"  "+nom);

//2. Le programme demande à l'utilisateur de saisir la date de naissance associée.
//      - L'utilisateur saisit la date de naissance.

System.out.println("  \n  saisissez une date de naissance au format dd-mm-yyyy");

String datesString = scanner.nextLine();

Date date = new SimpleDateFormat("dd-MM-yyyy").parse(datesString);

System.out.println("tu es né(e)le "+date);

//3. Le programme calcule l'âge de la personne en cours d'ajout.

//- Si l’âge est supérieur ou égal à 18 (majeur)
//dateComparaison.set(2006, 10, 21, 12, 0, 0);

LocalDate dateAujourdhui = LocalDate.now() ;

int age = dateAujourdhui.getYear() - date.getYear();

//Date date3 = new SimpleDateFormat("dd-MM-yyyy").parse(date2);

if(age > 17)
{
//- Le programme demande à l'utilisateur de saisir son métier.
scanner = new Scanner(System.in);

System.out.println("veuillez saisir votre métier \n");

String métier = scanner.nextLine();
System.out.println("le nom "+nom+" le prénom "+prénom+" date d'anniversaire "+date+" et le métier "+métier);
}
else//- Sinon l’âge est inférieur à 18 (mineur)
{
//- Le programme demande à l'utilisateur de saisir sa couleur préférée.
scanner = new Scanner(System.in);
System.out.println("Veuiller saisir votre couleur préférée \n");
String couleur = scanner.nextLine();
System.out.println("le nom "+nom+"le prénom"+prénom+"la date d'anniversaire"+" le métier "+couleur);
}

//4. Lorsque la saisie est terminée, le programme affiche les informations sous la forme suivante : 
//Nom Prénom - Date de naissance (âge) - Métier/Couleur préférée

scanner.close();

    }

}
