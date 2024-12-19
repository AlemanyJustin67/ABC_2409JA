import java.util.*;

public class partie2JePredisLavenir 
{

    public static void main(String[] args) throws Exception
    {

/*
 * 
 * Exercice 2.4 : Je prédis l’avenir
Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”
 */

int heures;
int minutes;
int calculeAM;
int calculeMi;

Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir deux nombres,heures et minutes : ");
heures = scanner.nextInt();
minutes = scanner.nextInt();

if (heures>23 || minutes>59 || minutes<0 || heures<0) 
{
  System.out.println("Les données saisies sont invalides");
}
else 
{

int calculeH = heures+1;
int calculeM =  minutes+3;
calculeMi = calculeM-60;
calculeAM = calculeH-24;
System.out.println("il sera dans 3 minutes "+heures+"h et "+calculeMi+"minutes"+calculeAM);

}

{
   
}

scanner.close();

    }
}
