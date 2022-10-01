package ads;

import java.util.Scanner;

/**
 *
 * @author willams
 */
public class Resultado {
        public float delta;
        public float a;
        public float b;
        public float c;
        public float x1;
        public float x2;
        
    public void res(){
        Scanner dados = new Scanner(System.in);
        System.out.println("-------formula de bhaskara-------");
        System.out.print("digite o valor de a: ");
        a = dados.nextFloat();
        System.out.print("digite o valor de b: ");
        b = dados.nextFloat();
        System.out.print("digite o valor de c: ");
        c = dados.nextFloat();
        System.out.println("---------------------------------");
        delta = (b*b)-(4*a*c);
        System.out.println("o valor de delta: " + delta);
        if (delta >= 0){
            x12();      
        }else {
            System.out.println("O delta é negativo. A equação não possui raízes reais");
            System.out.println("---------------------------------");
            System.exit(0);
        }
                  
}
    public void x12(){
        x1 = (float)(double) ((-(b) + Math.sqrt(delta)) / (2*a));
        x2 = (float)(double) ((-(b) - Math.sqrt(delta)) / (2*a));
 
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("---------------------------------");
    
    }
   
}
