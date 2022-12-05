
import model.Jogadores;
import model.Lizard;
import model.Paper;
import model.Rock;
import model.Scissors;
import model.Spock;
import model.TelaDoJogo;

public class App {
    public static void main(String[] args) throws Exception {
     TelaDoJogo.telaEscolha();  
     Rock rock = new Rock();
     Paper paper = new Paper();
     Scissors scissors = new Scissors();
     Lizard lizard = new Lizard();
     Spock spock = new Spock();

     switch(Jogadores.escolhaPlayer()){
         case 1:
             System.out.println("Jogador: ");
             rock.ExibirEscolhas();
             break;
         case 2:
             System.out.println("Jogador: ");
             paper.ExibirEscolhas();
             break;
         case 3: 
             System.out.println("Jogador: ");
             scissors.ExibirEscolhas();
             break;
         case 4: 
             System.out.println("Jogador: ");  
             lizard.ExibirEscolhas();
             break;  
         case 5:
             System.out.println("Jogador: ");
             spock.ExibirEscolhas();  
             break;  
         default:
             System.out.println("Não existe essa opção!!!");
             break;    
     }

     switch (Jogadores.escolhaDoPC()) {
         case 1:
             System.out.println("Jogador: ");
             rock.ExibirEscolhas();
             break;
         case 2:
             System.out.println("Jogador: ");
             paper.ExibirEscolhas();
             break; 
         case 3:
             System.out.println("Jogador: ");
             scissors.ExibirEscolhas();
             break;
         case 4: 
             System.out.println("Jogador: ");
             lizard.ExibirEscolhas();
             break;
         case 5:
             System.out.println("Jogador: ");
             spock.ExibirEscolhas();
             break;

     
         default:
             System.out.println("Não existe essa opção!!!");
             break;
     }

     if(Jogadores.valorEscolhidoPlayer == Jogadores.valorEscolhidoPc){
         System.out.println("Empate !!!");
     }else if((Jogadores.valorEscolhidoPlayer == 1 && Jogadores.valorEscolhidoPc == 3) || (Jogadores.valorEscolhidoPlayer == 2 && Jogadores.valorEscolhidoPc == 1) || (Jogadores.valorEscolhidoPlayer == 2 && Jogadores.valorEscolhidoPc == 3) || (Jogadores.valorEscolhidoPlayer == 1 && Jogadores.valorEscolhidoPc == 4) || (Jogadores.valorEscolhidoPlayer == 2 && Jogadores.valorEscolhidoPc == 5) || (Jogadores.valorEscolhidoPlayer == 3 && Jogadores.valorEscolhidoPc == 4) || (Jogadores.valorEscolhidoPlayer == 4 && Jogadores.valorEscolhidoPc == 2) || (Jogadores.valorEscolhidoPlayer == 4 && Jogadores.valorEscolhidoPc == 5) || (Jogadores.valorEscolhidoPlayer == 5 && Jogadores.valorEscolhidoPc == 1) || (Jogadores.valorEscolhidoPlayer == 5 && Jogadores.valorEscolhidoPc == 3)){
         System.out.println("Jogador: VENCEU !!!");
     }else{
         System.out.println("PC: VENCEU !!!");
     }
   

      
    }
}
