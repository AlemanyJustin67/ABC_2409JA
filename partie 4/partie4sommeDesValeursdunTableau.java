

public class partie4sommeDesValeursdunTableau {

public static void main(String[] args) {
    float somme = 0;    
    float[] tableau;
    float result = 0;


    tableau = new float[]{-10, -5,7,4,1,2,3,8,1,3 };

    for (int i = 0; i < tableau.length; i++) {
        result = somme + tableau[i];
    }

System.out.println("le résulat est  "+result);


}











} // fin class
