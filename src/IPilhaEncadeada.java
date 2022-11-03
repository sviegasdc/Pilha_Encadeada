public interface IPilhaEncadeada {
        void search(String elemento);
        int size();
        boolean isEmpty();
        void top() throws PilhaVaziaExcecao;
        void push(String elemento);
        Object pop() throws PilhaVaziaExcecao;
}
