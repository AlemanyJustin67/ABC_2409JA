package debut;


import java.util.Scanner; // importation de la classe java.util.scanner

public class entrainementJavaExoMickael {

    public static void main(String[] args) throws Exception{

//ENTREE STANDARD
//Scanner scanner = new Scanner(System.in);// création du nouveau scanner 
// mettre le code ici 
//scanner.close();


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//LIRE LES DONNEES SAISIES PAR UN UTILISATEUR
/*Scanner scanner;// va contenir 
String nom;

scanner = new Scanner(System.in); // création d'un nouveau scanner (objet)

System.out.println(" Veuillez Saisir votre nom");

nom = scanner.nextLine();// attente de la saisie utilisateur 

// le se poursuit lorsque l'utilisateur a validé avec la touche "entrée"
System.out.println("bienvenue "+ nom);

scanner.close();// fermeture du scanner obligatoire

/* */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 
Scanner scanner = new Scanner(System.in);// création d'un nouveau scanner 

String nom = scanner.nextLine();// lit la ligne entiere 

int age = scanner.nextInt();// l'utilisateur doit saisir un nombre entier

float salaire = scanner.nextFloat(); // l'utilisateur doit saisir un nombre à virgule

scanner.close();

*/

String nom;
int age;

Scanner scanner = new Scanner(System.in); // création du nouveau scanner 

System.out.println("Saisissez votre nom");

nom = scanner.nextLine();// lit la ligne entiere

System.out.println("Merci "+nom+".");

do{
    System.out.println("Saisissez votre âge");
    age=scanner.nextInt();
}
while(age<0);
System.out.println("Merci"+ nom + "vous avez "+age+"an(s)");
if(age>=18)
{
System.out.print("vous êtes majeur");
}
else
{
System.out.print("vous êtes mineur");
}

scanner.close();

    }

}
