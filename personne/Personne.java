package personne;
public class Personne {

// attribut, variable
private String prenom;
private String nom;
private int age;
private boolean sexe;
private double revenu;
private double autreRevenu;

// constructeur 
public Personne(String prenom,String nom,int age,boolean sexe,double revenu,double autreRevenu)
{

this.prenom=prenom;
this.nom=nom;
this.age=age;
this.sexe=sexe;
this.revenu=revenu;
this.autreRevenu=autreRevenu;

}
//getters qui récupère 
public String getPrenom()
{
return prenom;
}

public String getNom()
{
    return nom;
}

public int getAge()
{
    return age;
}

public double getRevenu()
{
    return revenu;
}

public double getautreRevenu()
{
    return autreRevenu;
}

public boolean isSexe()
{
    return sexe;
}

// setters qui modifie 
public void setPrenom(String prenom)
{
    this.prenom=prenom;
}

public void setNom(String nom)
{
this.nom = nom;
}

public void setAge(int age)
{
    this.age = age;
}

public double Charge(double revenu, double autreRevenu)
{
double result =(revenu*0.2+autreRevenu*0.15);
return result;
}

public void afficherInfo()
{
System.out.println("prénom :" + " "+prenom);
System.out.println("nom :" + " "+nom);
System.out.println("age :" +" " +age);
}

}
