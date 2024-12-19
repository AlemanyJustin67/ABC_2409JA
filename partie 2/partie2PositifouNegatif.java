import java.util.*;

public class partie2PositifouNegatif {

    public static void main(String[] args) throws Exception{

//Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.

//Pour information, le nombre 0 est considéré positif.

int nombre;
Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir un nombre ");
nombre= scanner.nextInt();

if(nombre<=0)
{
System.out.println("le nombre est négatif");
}
else
{
System.out.println("le nombre est égale ou au dessus de 0");
}
scanner.close();
    }

}
