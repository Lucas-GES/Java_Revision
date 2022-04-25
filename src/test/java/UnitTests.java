import instanceOf.exemplo1.A;
import instanceOf.exemplo1.B;
import instanceOf.exemplo1.InstanceOf;
import instanceOf.exemplo1.Printable;
import object.HashCode_Equals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTests {

    @Test
    public void assertInstanceOfA(){
        A a = new A();
        Assertions.assertTrue(a instanceof Printable);
    }

    @Test
    public void assertInstanceOfB(){
        B b = new B();
        Assertions.assertTrue(b instanceof Printable);
    }

    @Test
    public void assertHashCode(){
        HashCode_Equals hashCode_equals = new HashCode_Equals();
        int hash1 = hashCode_equals.hashCode();
        String test = "Blue";
        int hash2 = test.hashCode();

        Assertions.assertFalse(hash1 == hash2);
    }

    @Test
    public void assertHashCode2(){
        String test1 = new String("Blue");
        int hash1 = test1.hashCode();
        String test2 = new String("Blue");
        int hash2 = test2.hashCode();

        Assertions.assertFalse(test1 == test2);
    }

    @Test
    public void assertEquals(){
        HashCode_Equals obj = new HashCode_Equals();
        String test = "blue";
        boolean result = obj.getMyShirtColor().equals(test);
        Assertions.assertTrue(result);
    }

    @Test
    public void assertEquals2(){
        HashCode_Equals obj = new HashCode_Equals();
        HashCode_Equals obj2 = new HashCode_Equals();
        boolean result = obj.equals(obj2);
        Assertions.assertTrue(result);
    }
}
