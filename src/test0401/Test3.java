package test0401;

interface Beta {}
class Alpha implements Beta {
    String testIt() {
        return "Tested";
    }
}
class Gamma implements Beta {
    String testIt() {
        return "Gamma";
    }
}
public class Test3 {
    static Beta getIt() {
        return new Alpha();
    }
    public static void main(String[] args) {
        Beta b = getIt();
        System.out.println( ((Alpha)b).testIt() );
    }
}
