/*
Problema 1
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
	1/10
	2/11
	3/12
	4/13
	5/14
	6/15
*/
package aprendizajeautonomo;
public class practica_1 {
    public static void main(String[] args) {
        int num=1,num1=10;
        while (num<=6) {
            System.out.println(num + "/" + num1);
            num++;
            num1++;
        }
    }
}
