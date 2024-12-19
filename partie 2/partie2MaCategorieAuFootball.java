import java.util.*;

public class partie2MaCategorieAuFootball {

    public static void main(String[] args) throws Exception{


/*
  * 
  * Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

Trop jeune : Moins de 5 ans
Débutant : De 5 à 6 ans
Poussin : De 7 à 8 ans
Benjamin : De 9 à 10 ans
Pupille : De 11 à 12 ans
Cadet : De 15 à 16 ans
Junior : De 17 à 18 ans
Sénior : De 19 à 34 ans
Vétéran : 35 ans et +
     */


int age;
Scanner scanner = new Scanner(System.in);
System.out.println("veuillez saisir un age ");
age = scanner.nextInt();

if(age<5)
{
System.out.println("trop jeune Moins de 5 ans");
}
if(age>5&&age<6)
{
System.out.println("débutant de 5 à 6ans");
}
if (age>7&&age<8) 
{
System.out.println("poussin de 7 à 8 ans ");
}
if (age>9&&age<10)
{
    System.out.println("Benjamin : De 9 à 10 ans");
}
if (age>11&&age<12) 
{
System.out.println("Pupille : De 11 à 12 ans");
}
if (age>13&&age<14) 
{
System.out.println("Minime : De 13 à 14 ans");
}
if(age>15&&age<16)
{
System.out.println("Cadet : De 15 à 16 ans");
}
if (age>17&&age<18) 
{
System.out.println("Junior : De 17 à 18 ans");
}
if (age>19&&age<34) 
{
    System.out.println("Sénior : De 19 à 34 ans");
}
if (age>=35) 
{
    System.out.println("Vétéran : 35 ans et +");
}
    }







}
