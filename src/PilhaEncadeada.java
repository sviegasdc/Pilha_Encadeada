import java.util.ArrayList;
import java.util.List;

public class PilhaEncadeada implements IPilhaEncadeada {
    ArrayList<String> PilhaE;

    public PilhaEncadeada(){
        // criando o Arraylist
        PilhaE = new ArrayList<>();
    }

    public void search(String o) {
        // retorna "-1" se não existir
        int result = this.PilhaE.indexOf(o);
        if(result != -1) {
            System.out.println("O elemento '" + o + "' foi encontrado na pilha no índice: "+ result);
        } else {
            System.out.println("O elemento '" + o + "' não foi encontrado na pilha");
        }
    }

    public int size() {
        return PilhaE.size();
    }

    public boolean isEmpty() {
        return PilhaE.isEmpty();
    }

    public void top() throws PilhaVaziaExcecao {
        System.out.println("O topo da Pilha é: '"+ this.PilhaE.get(this.PilhaE.size() - 1) + "'");
    }

    public void push(String o) {
        this.PilhaE.add(o);
    }

    public Object pop() throws PilhaVaziaExcecao {
        if(isEmpty()){
            throw new PilhaVaziaExcecao("Não foi possível remover nenhum elemento pois a pilha está vazia.");
        }
        return PilhaE.remove(PilhaE.size()-1);
    }

    @Override
    public String toString() {
        String saida = "[ ";
        for (Object o : this.PilhaE) {
            saida += String.format("%s ", o);
        }
        saida += "]";
        return saida;
    }
}
