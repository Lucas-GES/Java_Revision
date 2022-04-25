package object;

import java.util.Objects;

public class HashCode_Equals {

    private String myShirtColor = "blue";

    public String getMyShirtColor() {
        return myShirtColor;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.myShirtColor);
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof HashCode_Equals){
            HashCode_Equals test = (HashCode_Equals) obj;
            if(test.myShirtColor == this.myShirtColor){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashCode_Equals hash = new HashCode_Equals();
        HashCode_Equals hash2 = new HashCode_Equals();
        int x = hash.hashCode();
        int y = hash2.hashCode();

        System.out.println(hash.hashCode());
        System.out.println(hash2.hashCode());
        System.out.println(x == y);
        System.out.println(hash.myShirtColor.equals("blue"));
    }

}
