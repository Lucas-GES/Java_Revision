package instanceOf.exemplo1;

import java.util.Objects;

public class InstanceOf {


    public static void main(String args[]){
        // Create new object p of Printable type
        Printable p=new B();
        // Create new object c of Call type
        Call c=new Call();
        // use object c to call invoke() method and pass p as parameter
        // as p are Printable type, the interface that A and B classes implements
        // the instance of is gonna return de b method print call
        c.invoke(p);
    }

}
