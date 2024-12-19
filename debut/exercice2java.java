package debut;
public class exercice2java {


    /*  EXERCICE 2 : Créer un algo qui affiche successivement les puissances de 2 */
    public static void main(String[] args) throws Exception{

// déclaration de la variable saisie utilisateur 
int i=1;

System.out.print("\n1");

while (i<500000000) 
{
System.out.println("\n");

    i=i*2;
    
    System.out.println(i);
}

}
}