package concepts.subsets_and_Permutaton;

public class permutation {
    public void allPermutationOfaString(String p,String up){
        if (up.isEmpty()){
            System.out.print(p + ", ");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length(); i++) {
            allPermutationOfaString( p.substring() , up.substring(1));
        }

    }
}
