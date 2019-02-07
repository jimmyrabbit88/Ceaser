public class Cipher {
    public static String encryptCaesarCipher(String plaintext, int offset){
        if(offset >= 26){
            offset = offset%26;
        }

        String s = "";
        int max = 'Z';
        for(int i=0; i<plaintext.length(); i++){
            if(plaintext.charAt(i) != ' '){
                int chnum = plaintext.charAt(i);
                chnum += offset;
                if(chnum > max){
                    chnum -= 26;
                }

                s += (char)chnum;
            }
            else{
                s += plaintext.charAt(i);
            }
        }

        return s;
    }

    public static String decryptCaesarCipher(String plaintext, int offset){
        int reset = 26-offset;
        return encryptCaesarCipher(plaintext, reset);
    }

}
