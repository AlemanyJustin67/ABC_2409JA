package debut;
import java.util.*;

public class Calcul_de_la_surface_dun_secteur_circulaire {


    public static void main(String[] args) throws Exception{

/*
 * 
 Lire le rayon R d’un cercle et un angle A (en degré(s)).

Calculer et afficher :

L’ aire du secteur circulaire = (π R² A) / 360

 */

double rayon;
double degre;

Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir un rayon");
rayon = scanner.nextDouble();
System.out.println("veuillez saisir un degre");
degre = scanner.nextDouble();

double aireDuSecteurCirculaire; 
aireDuSecteurCirculaire = Math.PI*(Math.pow(rayon,2)*degre)/360;

System.out.print(aireDuSecteurCirculaire);

scanner.close();

    }

}
