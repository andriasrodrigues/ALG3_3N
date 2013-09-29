import java.lang.System;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
    Imagem img = new Imagem();
    
    Scanner ler = new Scanner(System.in);
    
   /* System.out.printf("Informe a altura: ");
    
    img.setAltura(ler.nextInt());
    
    System.out.printf("Informe a altura: ");
    
    img.setLargura(ler.nextInt());
   
   
   
   System.out.printf("Imagem colorida S/N: ");
   img.setColorido(ler.next().charAt(0));
   
   Cor c = new Cor();
   
   if(img.getColorido() == 'S'){
       
       System.out.printf("Digite o valor de R ");
       c.setR(ler.nextInt());
       
       System.out.printf("Digite o valor de G ");
       c.setG(ler.nextInt());
       
       System.out.printf("Digite o valor de B ");
       c.setB(ler.nextInt());
   
       
   }
   else{
       
      System.out.printf("Digite o valor de G ");
       c.setG(ler.nextInt());
    
      
   } */
   
       
    
         System.out.printf("Digite a figura que deseja: ");
        
         img.setFigura(ler.next());
         
         if(img.getFigura() == "Circulo"){
             
             Circulo cir = new Circulo();
             
             cir.Draw();
             
         }
             
    
      
   
   
   
   
   
   
 

    
    
}   

}