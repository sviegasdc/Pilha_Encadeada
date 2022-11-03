public class TestePIlhaE {
    public static void main(String[] args) {
       PilhaEncadeada PilhaE = new PilhaEncadeada(10);
        PilhaE.push("hollow");
        PilhaE.push("cove");
        PilhaE.push("sammy");
        PilhaE.push("lilith");
        PilhaE.push("ghost");
        System.out.println(PilhaE);
        System.out.println(PilhaE);
        PilhaE.search("ghost");
        PilhaE.top();

    }
}