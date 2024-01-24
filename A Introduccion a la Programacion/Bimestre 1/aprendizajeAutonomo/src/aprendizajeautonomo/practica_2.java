/*
Problema 2
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:

	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
*/
package aprendizajeautonomo;
public class practica_2 {
    public static void main(String[] args) {
        int num=5, den=10;
        while (num <= 30){
            System.out.println(num + "/" + den);
        num+=5;
        den+=2;
        }
    }
}
