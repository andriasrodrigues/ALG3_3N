import java.util.Scanner;

public class Circulo extends Shape {
    
    Scanner ler = new Scanner(System.in);
    
    Imagem img = new Imagem();
    
    
    int x = img.getAltura();
    int y = img.getLargura();
    int R;
    
    
    
     int [][] Ponto = new int [x][y];
     
     
    
    
   public void setCentro(int[][] Ponto) {
       this.Ponto = Ponto;
       
        }
    
   public void setRaio(int R){
       this.R = R;
       
   }
    
    @Override
   public void Draw(){
       System.out.printf("Digite o circulo do centro: ");
       
        
       
       
               }          
    
    
}
