import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;// la classe Scanner permet à un utilisateur d'écrire du texte et au programme de lire ce texte.

public class exo7 {
/*  EXERCICE 7 : Convertir des jours au format année | mois | jours */

public static void main(String[] args) throws Exception {

int saisieUtilisateurEnJour = 85;
int année = saisieUtilisateurEnJour/365;
int mois = année/30-(année*12);
int jours =(saisieUtilisateurEnJour%365)%7;

//L’opérateur modulo ou reste renvoie le reste des deux nombres après division. Si vous disposez de deux nombres, disons A et B, A est le dividende et B est le diviseur, A mod B est là un reste de la division de A et B. L’opérateur modulo est un opérateur arithmétique qui est noté %.
System.out.println("nombre d'année  "+année+"  et le nombre de mois"+mois+"  et pour finir le nombre de jours restant "+jours);

}}
