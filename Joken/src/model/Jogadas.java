package model;

public abstract class Jogadas {
      //  1-Rock   2-Paper  3-Scissors  4-Lizard  5-Spock 
     //  Formas de Vitoria // 
    //1-Rock -> crushes -> ['Scissors', 'Lizard']; 
   //2-Paper -> covers -> ['Rock',  disproves -> ['Spock']];
  //3-Scissors -> cuts -> ['Paper',  decapitates -> ['Lizard']];
 //4-Lizard -> eats -> ['Paper', poisons -> ['Spock']];
//5-Spock -> smashes -> ['Scissors', vaporises -> ['Rock']]; 
 public  void ExibirEscolhas(){
       System.out.println("");
 }

}
