public interface IPilhaEncadeada {
        int size();
        boolean isEmpty();
        void top() throws PilhaVaziaExcecao;
        void push(Object o);
        Object pop() throws PilhaVaziaExcecao;
}
