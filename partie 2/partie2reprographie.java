import java.util.*;

public class partie2reprographie {

    public static void main(String[] args) throws Exception{

/*Exercice 2.5 : Réprographie
Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

*/
double photocopie10 = 0.10;
double photocopie20 = 0.09;
double photocopie30 = 0.08;  
double photocopieSaisie;
double facture;  

Scanner scanner = new Scanner(System.in);
System.out.print("saisir le nombre de photocopie à imprimer");
photocopieSaisie = scanner.nextDouble();

if (photocopieSaisie<=10 ) 
{
    facture = photocopieSaisie * photocopie10;
    System.out.println("la facture est de "+facture);
}
else if(photocopieSaisie>10 && photocopieSaisie<=30)
{
    facture = 10*photocopie10+(photocopieSaisie-10*photocopie20);
    System.out.println("la facture est de "+facture);
}
else if (photocopieSaisie>30) 
{
    facture = (photocopie10*10)+(photocopie20*20)+(photocopieSaisie-30*photocopie30);
    System.out.println("La facture est de "+facture);
}
{

}

scanner.close();

    }

}
