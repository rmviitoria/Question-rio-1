/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.InputStream;

/**
 *
 * @author Usuario
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn=new Scanner (System.in);
        double pi=3.14;

        System.out.println("Digite o Radio:");
        double radio=scn.nextDouble ();

        double diametro;
        diametro = 2d;
ouble radio1 = null;
        ouble radio11;
        radio11 = radio1;
        double perimetro;
        perimetro = 2;
        double radio2;
        radio2 = radio;
        double area=piMath.pow(radio, 2);

        System.out.println("Diametro: "+diametro+"\nPerimetro: "+perimetro+"\narea: "+area);
    }

    private static class piMath {

        private static double pow(double radio, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public piMath() {
        }
    }

    private static class Scanner {

        public Scanner() {
        }

        private Scanner(InputStream in) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private double nextDouble() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class ouble {

        public ouble() {
        }
    }
    
}
 




    }
    
}
