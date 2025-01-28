package questions;

public class findCommonDivisor {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int len = findCommonDivisorLength(str1.length(),str2.length());
        return str1.substring(0,len);
    }

    int findCommonDivisorLength(int i,int j){
        if (i == j){
            return i;
        }
        int g = Math.max(i,j);
        int l = Math.min(i,j);
        return findCommonDivisorLength(g - l,l);
    }
}
