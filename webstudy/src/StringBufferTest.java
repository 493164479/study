public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("abc").append(123).append(false);
        stringBuffer.deleteCharAt(0);
        stringBuffer.replace(0,2,"qz");
        System.out.println(stringBuffer.charAt(2));

        System.out.println(stringBuffer+" ");

    }
}
