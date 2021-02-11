public class main {

    public static void main(String[] args){

        String strings=" Hello World! ";

        System.out.println(strings);
        System.out.println(strings.toLowerCase());
        System.out.println(strings.toUpperCase());
        System.out.println(strings.replaceFirst("World","Codersbay"));
        System.out.println(strings.substring(1, strings.length() - 1));
        System.out.println((strings+"\n").repeat(15));
         }
}
