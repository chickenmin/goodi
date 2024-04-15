package chap7;

import chap7.test.Modifier2;

public class ModifierEx2 {
    public static void main(String[] args) {
        Modifier2 m2 = new Modifier2();
//        m2.v1 = 10; //private
//        m2.v2 = 20; //default
//        m2.v3 = 30; //protected
//        m2.v4 = 40; //public
        m2.method(); //public

    }
}
