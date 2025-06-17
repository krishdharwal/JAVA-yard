package Questions;

class  RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0){
                System.out.println(n%i);
                // call to find the repetition
                if (haveRepeated(s,s.substring(0,i))) return true;
            }
        }
        return false;
    }

    private boolean haveRepeated(String s, String t) {
        int n = t.length();
        for (int i = 0; i < s.length(); i = i + n) {
            if (!s.substring(i,i+n).equals(t)) return false;
        }
        return true;
    }

}