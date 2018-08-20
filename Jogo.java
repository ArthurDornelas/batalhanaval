package batalhanaval;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ice
 */
public class Jogo {
    
    Scanner ler = new Scanner(System.in);
    int tabuleiro[] = new int[15];
    Jogador jogadores[] = new Jogador[2];

    public Jogo() {
        
        for(int i=0 ; i< tabuleiro.length ; i++)
        {
            tabuleiro[i] = 0;
            
        }
        
    }
    
    
    void posicaoBarco(){
        
      Random rand = new Random();
      int  n = rand.nextInt(14) + 0;
      
      tabuleiro[n] = 1;
     
    }
    
    void jogadores(){
        
        
        
        for(int i=0 ; i < jogadores.length ; i++)
        {
        
            int n;
            n = ler.nextInt();
            jogadores[i] = new Jogador(n);
           
            
        }
        
    }
    
    void checaPalpite(){
        
      posicaoBarco();  
      int g = 0;
      for(int j=0 ; g!=1 ; j++){
        
        for(int i=0 ; i<jogadores.length ; i++)
        {
            int n = ler.nextInt();
            jogadores[i].Palpite(n);
            
            if(tabuleiro[n] == 1 ){
              
              System.out.println("o Jogador " + i + " ganhou");
                
            }
            else
                System.out.println("Agua");
        }
        
      }
        
    }
    
}
