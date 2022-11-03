
public class PilhaEncadeada implements IPilhaEncadeada {
    private String PilhaE[];
    public int topo;

    public int indice;

    public PilhaEncadeada(int size) {
        this.PilhaE = new String[size];
        this.topo = -1; // começo do array
    }

    public int searchToReturn(String elemento){
        for (indice = 0; indice <= this.PilhaE.length - 1; indice++) {
            if (this.PilhaE[indice] == elemento)
                return indice;
        }
        return -1;
    }

    public void search(String elemento) {
        if(searchToReturn(elemento) != - 1){
            System.out.println("O elemento '" + elemento + "' foi encontrado na pilha no índice: " + this.indice);
        }
        else{
            System.out.println("O elemento '" + elemento + "' não foi encontrado na pilha");
        }
    }

    public int size() {
        return this.PilhaE.length - 1;
    }

    public boolean isEmpty() {
        return this.topo < 0;
    }

    public void top() throws PilhaVaziaExcecao {
        System.out.println("O topo da Pilha é: '" + this.PilhaE[topo] + "'" + " no índice: '"+ this.topo+"'");
    }

    public void push(String elemento) {
        if (topo + 1 != this.PilhaE.length - 1) {
            topo++; // indo para próxima posição para depois inserir
            this.PilhaE[topo] = elemento;
        } else {
            System.out.println("A Pilha chegou ao topo, hora de duplicar");
            duplicaArray();
        }
    }

    public Object pop() throws PilhaVaziaExcecao {
        if(isEmpty()){
            throw new PilhaVaziaExcecao("Não foi possível remover nenhum elemento pois a pilha está vazia.");
        }
        else {
            String elementoParaRemover = this.PilhaE[topo];
            this.PilhaE[topo] = null; // substitui o elemento removido por 'null'
            // t ← t − 1
            this.topo--; // volta uma "casa" para ter um novo topo
            return elementoParaRemover;
        }
    }

    private void duplicaArray() {
        int novoSize = this.PilhaE.length * 2;
        String novoArray[] = new String[novoSize];

        // copiar elementos da pilha
        for (int i = 0; i <= this.topo; i++) {
            novoArray[i] = this.PilhaE[i];
        }
        this.PilhaE = novoArray;
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
