package a0326.string;

public class StringEx2 {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("원본문자열: " + str);

        System.out.println(str.compareTo("bcdf")); //다르면 -1
        System.out.println(str.compareTo("abcd")); //두문자 같으면 0

        System.out.println(str.compareTo("Abcd")); //32
        System.out.println(str.compareToIgnoreCase("Abcd"));//두문자 같으면 0
        System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
        //  "a"의 유니코드 값은 97이고,

         // "A"의 유니코드 값은 65입니다.
    }
}
