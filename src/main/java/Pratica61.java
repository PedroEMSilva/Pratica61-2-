
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
 Time t1=new Time();
 Time t2=new Time();
 t1.addJogador("gol",new Jogador(12, "Júlio César"));
 t1.addJogador("atk",new Jogador(11, "Tuba"));
 t1.addJogador("def",new Jogador(10, "Capivaraquadrada")); 
 t2.addJogador("gol",new Jogador(12, "Neymar")); 
 t2.addJogador("atk",new Jogador(11, "Hue")); 
 t2.addJogador("def",new Jogador(10, "asuashuashaus da Silva")); 
        System.out.println("Posição    Time 1        Time 2");
        for (String key1 : t1.getJogadores().keySet()) {
            for (String key2 : t2.getJogadores().keySet()) {
                  if(key1==key2){
                      System.out.println(key1+"        "+t1.getJogadores().get(key1)+"    "+t2.getJogadores().get(key1));
                  }
                  
            }
        }
    }
}
