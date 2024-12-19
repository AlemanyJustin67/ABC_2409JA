package debut;
import java.util.*;// importe toutes les classes 
// import java.util.Scanner

public class CalculAireEtVolumeSphere {

    public static void main(String[] args) throws Exception{
/* 
        Exercice 1.4 : Calcul de l’aire et du volume d’une sphère
        Lire le rayon R d’une sphère puis calculer et afficher :
        
        L’aire de la sphère = 4 π R²
        Le volume de la sphère = (4 π R³)/3
        Exemple de fonctionnement du programme en mode Console :
        
        Veuillez saisir un rayon : 42 
        L'aire de la sphère est : 22167.0778
        Le volume de la sphère est : 310181.76
        Appuyez sur une touche pour quitter.
*/

double rayon;
Scanner scanner= new Scanner(System.in);// création du nouveau scanner 
System.out.println("Veuillez saisir un rayon :\n");
rayon = scanner.nextDouble();
System.out.println("vous avez saisie un rayon de \n"+rayon);//affiche rayon

double aireSphere = 4*Math.PI*Math.pow(rayon,2);// calcul rayon 

System.out.println("Le résultat du calcul de l'air est de \n"+aireSphere);

double volume;
volume=4*Math.PI*(Math.pow(rayon, 3))/3;
System.out.println("Le résultat du calcul du volume est de \n"+volume);

scanner.close();

return;

    }

}
