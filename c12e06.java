package Exerci_MOD3;
import java.util.Scanner; 
public class c12e06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         String meses[]= new String[12];
         for (int aux=0;aux<meses.length;aux++){
            System.out.println("Digite o mês: ");
            meses[aux]=teclado.nextLine();

         }
         for(int aux=meses.length-1;aux>=0;aux--){
         System.out.println(meses[aux]);
         }
         teclado.close();

    }
    
}
