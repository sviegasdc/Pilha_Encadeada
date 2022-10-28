public class TestePIlhaE {
    public static void main(String[] args) {
       PilhaEncadeada PilhaE = new PilhaEncadeada();
        PilhaE.push("hollow");
        PilhaE.push("hollow");
        PilhaE.push("hollow");
        System.out.println(PilhaE);
        PilhaE.pop();
        PilhaE.pop();
        PilhaE.pop();
        System.out.println(PilhaE);
        PilhaE.top();

    }
}