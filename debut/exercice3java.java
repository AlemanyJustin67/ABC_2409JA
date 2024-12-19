package debut;
public class exercice3java {

    public static void main(String[] args) throws Exception{

/*  EXERCICE 3 : Vérifier si les 3 entrée ( A ou B ) ET C sont vrai* , afficher sa sortie */
boolean a =false;
boolean b =false;
boolean c =true;


if(a || b && c)
{

System.out.print(a);
System.out.print(b);
System.out.print(c);
System.out.print("le résultat est vrai");
}
else
{

    System.out.print("le résultat est faux");
}
    }

}
