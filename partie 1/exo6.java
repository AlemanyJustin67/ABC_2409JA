public class exo6 {
/*  EXERCICE 6 : Créer un convertisseur de secondes au format Heures : Minutes : secondes */

//heures = valeurinitiale/3600 ; minutes = (valeurinitiale - heures*3600)/60 ; secondes = (valeurinitiale - heures*3600)- minutes*60
/*public static String conversionSec(int seconde){

int heures = seconde/3600;
int minutes = (seconde%3600)/60;
int secondes = (seconde%60);
String resultat= "";
return resultat +heures+":"+minutes+":"+secondes;*/
public static void main(String[] args) throws Exception {
    // saisie utilisateur 
int valeurinitiale = 80;
// converti les heures en secondes 
int heures = valeurinitiale/3600;
// converti les minutes en secondes
int minutes = valeurinitiale/60 -heures*60;
// fkf
int secondes = (valeurinitiale-heures*3600)-minutes*60;
// affiche le résultat 
System.out.println( "  heures  "+ heures +"  minutes  " +minutes +"  secondes  "+ secondes);

}}