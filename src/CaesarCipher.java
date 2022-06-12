public class CaesarCipher {
    //Only for small letter
    public static String encryptString(String str, int rot){
        String ans = "";
        int num = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
                ans += str.charAt(i);
                continue;
            }

            if((int)str.charAt(i) + rot > 122)
                num = ((int)str.charAt(i) + rot)%122 + 96;
            else
                num = (int)str.charAt(i) + rot;

            ans+=(char)num;
        }

        return ans;
    }

    public static String decryptString(String str, int rot){
        String ans = "";
        int num = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
                ans += str.charAt(i);
                continue;
            }

            if((int)str.charAt(i) - rot < 97)
                num = 122-(96-((int)str.charAt(i) - rot));
            else
                num = (int)str.charAt(i) - rot;

            ans+=(char)num;
        }

        return ans;
    }

    public static void cipher(){
        String str = "hello world, my name is shadab eqbal.";
        String encryptedString = encryptString(str,13);
        System.out.println(encryptedString);
        String decryptedString = decryptString(encryptedString,13);
        System.out.println(decryptedString);
    }
}
