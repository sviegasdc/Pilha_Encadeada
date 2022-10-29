public class TestePIlhaE {
    public static void main(String[] args) {
       PilhaEncadeada PilhaE = new PilhaEncadeada();
        PilhaE.push("hollow");
        PilhaE.push("cove");
        PilhaE.push("sammy");
        System.out.println(PilhaE);
        PilhaE.pop();
        System.out.println(PilhaE);
        PilhaE.search("sammy");
        PilhaE.top();


    }
}