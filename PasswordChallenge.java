public class PasswordChallenge {
    public static String maskify(String str) {
        StringBuilder myPassword = new StringBuilder(str);
        String newStuff = new String();
        if (str.length() > 4) {
            for (int i = 0; i < str.length()-4; i++) {
                myPassword.setCharAt(i, '#');
                newStuff = myPassword.toString();
            }
        }
        return newStuff;
    }
    public static void main(String[] args) {
        System.out.println(maskify("Have a nice day.."));
    }
}
