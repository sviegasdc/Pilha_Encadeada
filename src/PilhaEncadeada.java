import java.util.ArrayList;
public class PilhaEncadeada implements IPilhaEncadeada {
    ArrayList<Object> PilhaE;

    public PilhaEncadeada(){
        // criando o Arraylist
        PilhaE = new ArrayList<>();
    }

    public int size() {
        return PilhaE.size();
    }

    public boolean isEmpty() {
        return PilhaE.size() == 0;
    }

    public void top() throws PilhaVaziaExcecao {
        System.out.println(PilhaE.size());
    }

    public void push(Object o) {
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
