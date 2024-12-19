package bouteille;


public class bouteille {
   
private boolean estOuvert;
private float contenanceEnMl;
private float contenuEnPourcentage;

 public bouteille()// constructeur par défaut 
 {

 }   
     
public bouteille(boolean estOuvert, float contenanceEnMl,float contenuEnPourcentage) // constructeur classique 
{
this.estOuvert = estOuvert;
this.contenanceEnMl = contenanceEnMl;
this.contenuEnPourcentage = contenuEnPourcentage;
}

public bouteille(bouteille bouteille1) // constructeur par clonage 
{

}

public boolean Vider()
{
    if (estOuvert==true) 
    {
        contenuEnPourcentage=0;
    }
return true;
}

public boolean Vider(float pourCentageAVider)
{
if(estOuvert==true && contenanceEnMl != 0)
{
  float result= contenuEnPourcentage - pourCentageAVider;
}
return false;
}

public boolean Ouvrir()
{
if(estOuvert == false)
{
estOuvert = true;
}
    return true;
}

public boolean Remplir()
{
    if(estOuvert==true )
    {
contenuEnPourcentage=100;
    }
return true;
}

public boolean Remplir(float pourcentageARemplir)
{
    if(estOuvert==true && contenuEnPourcentage!=100)
    {
contenuEnPourcentage=100;
    }
return true;
}

public void ToString()
{
System.out.println("le contenu en pourcentage est de "+contenuEnPourcentage);
System.out.println("la contenance de la bouteille est de "+contenanceEnMl);
System.out.println("la bouteille est ouverte? "+estOuvert);

}

}
