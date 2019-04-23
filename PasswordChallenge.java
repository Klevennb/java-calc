public class PasswordChallenge {
    public static StringBuilder maskify(String str) {
        // throw new UnsupportedOperationException("Unimplemented");
        StringBuilder myPassword = new StringBuilder(str);
        if (str.length() > 4) {
            for (int i = 0; i < str.length()-4; i++) {
                
                myPassword.setCharAt(i, 'x');
                System.out.println(myPassword);
            }
            }
        return myPassword;
        // }
        // System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Weigh-In process!!");
        // checkIfFits(100, 39);
        System.out.println(maskify("Have a nice day.."));

    }

}

// public class Throw {
//     // static void checkIfFits(int height, int width) {
//         if (6 > 4) {
//             // for (int i = 0; i < str.length()-4; i++) {
//             // // StringBuilder myPassword = new StringBuilder(str);
//             // // myPassword.setCharAt(i, 'x');
//             // }
//             System.out.println("haha");
//         }
//     }


