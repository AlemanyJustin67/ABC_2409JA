import java.util.Scanner;

public class partie2bisextille {


    public static void main(String[] args) throws Exception
    {

/*Exercice 2.6 : Bisextille
Ecrire un algorithme qui détermine si une année est bissextile.

Les années bissextiles sont :

les années divisibles par 4 mais non divisibles par 100
les années divisibles par 400. */

int annéeSaisie;
Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir une année ");
annéeSaisie = scanner.nextInt();

if(annéeSaisie%4==0 && annéeSaisie%100!=0 || annéeSaisie%400==0)
{
System.out.println("année "+annéeSaisie+" est bissexctile");

}
else
{
System.out.println(" année n'est pas bissextile");

}

scanner.close();

    }

}
