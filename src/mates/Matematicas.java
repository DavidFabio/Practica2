package mates;

public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de
     * Montecarlo. El parámetro `pasos` indica el número de puntos
     * generado.
     */

    static double r=1;
    static double aciertos=0;

    public static double generarNumerosPiIterativo(long pasos){
        if(pasos==0){
            return 0;
        }
        else{
            double x =  -r + Math.random()*r;
            double y = -r + Math.random()*r;
            double comprobacion = x*x + y*y;
            if (comprobacion <= r*r){
            aciertos++;
            }
            generarNumerosPiIterativo(--pasos);
        }
        return 0.4 *(10*aciertos/pasos);
    }
}
