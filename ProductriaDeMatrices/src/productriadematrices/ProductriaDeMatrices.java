/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productriadematrices;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Universidad del norte 
 * epartamento de Sistemas 
 * Algoritmos y complejdad
 * Profesor: Ingeniero Capacho
 * 2 Febrero 2018
 * @author William Cadenas cod 200087219 
 **/
public class ProductriaDeMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos veces desea multiplicar la matriz:");
        String str = sc.nextLine();
        BigInteger n = new BigInteger(str);

        //BigInteger.ZERO
        //BigInteger.ONE
        BigInteger[][] matriz = {{BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO}, {BigInteger.ONE, BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO}};
        BigInteger[][] matriz2 = {{BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO}, {BigInteger.ONE, BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO}};
        BigInteger[][] resultado = new BigInteger[4][4];
        
        BigInteger k = BigInteger.ZERO;
        System.out.println("Resultado:");
        while (k.compareTo(n) < 0) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    resultado[j][i] = sum(matriz,matriz2,j,i);
                }
            }
            Asignar(resultado, matriz2);
            k = k.add(BigInteger.ONE);
        } 
        mostrar(resultado);
    }

    static void mostrar(BigInteger[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("");
        }
    }
    
    static BigInteger sum (BigInteger[][] m, BigInteger[][] r, int indiceM, int indiceR){
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < 4; i++) {
            sum = sum.add(m[indiceM][i].multiply(r[i][indiceR]));
        }
        return sum;
    }

    private static void Asignar(BigInteger[][] resultado, BigInteger[][] matriz2) {
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = resultado[i][j];
            }
        }
    }

}
