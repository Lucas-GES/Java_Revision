package instanceOf.exemplo1;

public class Call {

    public void invoke(Printable p){//upcasting
        if(p instanceof A){

            A a=(A)p;//Downcasting
            a.a();
        }
        if(p instanceof B){
            B b=(B)p;//Downcasting
            b.b();
        }

    }
}//end of Call class
