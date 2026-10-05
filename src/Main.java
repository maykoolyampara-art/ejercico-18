//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numeros= {2, 1, 2, 3, 3, 4, 2, 4};
        int contador = 0;
        for (int i=0; i<= numeros.length - 3; i++) {
            if (numeros[i] == numeros[i + 2] && numeros[i]!= numeros[i + 1]) {
                System.out.println("bumeran: ["+numeros[i]+","+numeros[i+1]+","+numeros[i+2]+"]");

                contador++;
            }
        }
        System.out.println("total de bumeranes:" +contador);
    }
}