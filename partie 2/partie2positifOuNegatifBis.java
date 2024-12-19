import java.util.*;

public class partie2positifOuNegatifBis {


    public static void main(String[] args) throws Exception
    {

//Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.

int nombre1;
int nombre2;
Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir deux nombres entiers pour calculer le produit ");
nombre1= scanner.nextInt();
nombre2 = scanner.nextInt();
int résultat = nombre1*nombre2;
System.out.println(résultat);

if(résultat<=0)
{
System.out.println("le produit est négatif");

}
else
{
System.out.println("le produit est positif");

}
scanner.close();

    }
}
