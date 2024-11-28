public class FirstUppercae {
    public static void main(String[] args) {
        String letter = "helloSir";
        FU(letter);
        FU2(letter);

    }

    private static void FU(String letter) {
        for (int i = 0; i < letter.length(); i++) {
            if (Character.isUpperCase(letter.charAt(i))){
                System.out.println(letter.charAt(i));
            }
        }

    }

    private static void FU2(String letter) {
        if (letter.length() == 1){
            return;
        }
        if (Character.isUpperCase(letter.charAt(0))) System.out.println(letter.charAt(0));
        FU2(letter.substring(1));
    }
    }
