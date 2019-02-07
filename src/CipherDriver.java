public class CipherDriver {
    public static void main(String[] args) {
        String eCC = Cipher.encryptCaesarCipher("ABC ABC", 1);
        System.out.println(eCC + " Expected to get : BCD BCD");
        eCC = Cipher.decryptCaesarCipher(eCC, 1);
        System.out.println(eCC + " Expected to get : ABC ABC");

        eCC = Cipher.encryptCaesarCipher("XYZ YZA", 1);
        System.out.println(eCC + " Expected to get : YZA ZAB");
        eCC = Cipher.decryptCaesarCipher(eCC, 1);
        System.out.println(eCC + " Expected to get : XYZ YZA");

        eCC = Cipher.encryptCaesarCipher("ABCDE", 25);
        System.out.println(eCC + " Expected to get : ZABCD");
        eCC = Cipher.decryptCaesarCipher(eCC, 25);
        System.out.println(eCC + " Expected to get : ABCDE");

        eCC = Cipher.encryptCaesarCipher("ABCDE", 30);
        System.out.println(eCC + " Expected to get : EFGHI");
        eCC = Cipher.decryptCaesarCipher(eCC, 30);
        System.out.println(eCC + " Expected to get : ABCDE");
    }
}
