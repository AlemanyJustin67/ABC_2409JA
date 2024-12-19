package personne;
import java.util.Scanner;// import de la classe Scanner 

public class Main {

public static void main (String[]args){
// création du scanner 
Scanner scan = new Scanner(System.in);

 // Instantiation d'un objet Personne avec les valeurs spécifiques
Personne personne = new Personne("Justino", "Alemany", 36,false,9500.00,99999.00);

personne.afficherInfo();// affiche les valeurs de l'objet personne 

scan.close();// fermeture du scanner 

}

}
