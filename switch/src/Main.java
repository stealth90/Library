import java.util.Scanner;
import java.awt.*;
public class Main {
    public static void main(String[] args){
        boolean menu= true;
        while(menu){
            System.out.println("________________________________________________");
            System.out.println("|\tBenvenuto. Fai la tua scelta\t\t|");
            System.out.println("|1 - Stampa i valori dell'equazione y=x^2+10x-2 |");
            System.out.println("|2 - Stampa la matrice 10x10\t\t\t|");
            System.out.println("|3 - Calcolo del massimo e del minimo\t\t|");
            System.out.println("|4 - Calcolo altezza nella norma\t\t|");
            System.out.println("|5 - Esci\t\t\t\t\t|");
            System.out.println("________________________________________________");
            Scanner scan= new Scanner(System.in);
            int opt= scan.nextInt();
            switch(opt) {
                case 1: equa();
                    break;
                case 2: matrix();
                    break;
                case 3: minMax();
                    break;
                case 4: heigh();
                    break;
                case 5: {
                    System.out.println("Grazie e Arriverderci");
                    menu=false;
                    break;
                }
                default:
                    System.out.println("L'opzione inserita e' errata");
            }
        }
    }

    public static void equa(){
        int x;
        for(x=19;x>=-9;x-=2)
            System.out.println("x="+x+" y=" +"((x*x)+(10*x)-2)");
    }

    public static void matrix(){
        for(int a=1;a<=10;a++){
            for(int b=1;b<=10;b++)
                System.out.print(b*a+"\t");
            System.out.println("");
        }
    }

    public static void minMax(){
        int  min, max;
        System.out.println("Quanti numeri vuoi confrontare?");
        Scanner scanMinMax = new Scanner(System.in);
        int N = scanMinMax.nextInt();
        System.out.println("Inserisci il valore");
        int var = scanMinMax.nextInt();
        max=var;
        min=var;
        while(N>1){
            System.out.println("Inserisci il valore");
            int vari = scanMinMax.nextInt();
            if(vari>max)
                max=vari;
            if(vari<min)
                min=vari;
            N--;
        }
        System.out.println("Il numero piu' grande e' "+max+" e quello più piccolo è " + min);
    }

    public static void heigh(){
        System.out.println("Prego, Inserire l'altezza, espressa in cm");
        Scanner heigh = new Scanner(System.in);
        int h= heigh.nextInt();
        System.out.println("Prego, inserire l'eta'");
        int age = heigh.nextInt();
        if((h<80 && age<=6)||(h>=80&&h<250)){
            System.out.println("Altezza nella norma");
        }
        System.out.println("Altezza non nella norma");
    }
}
