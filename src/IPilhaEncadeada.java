public interface IPilhaEncadeada {
        void search(String o);
        int size();
        boolean isEmpty();
        void top() throws PilhaVaziaExcecao;
        void push(String o);
        Object pop() throws PilhaVaziaExcecao;
}
