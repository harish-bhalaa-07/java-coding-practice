public class substringReplace {
    public static void main(String[] args) {
        String originalString = "Hello world, welcome to the world of Java";
        String target = "world";
        String replacement = "universe";

        String modifiedString = originalString.replaceAll(target, replacement);
        System.out.println(modifiedString); 
    }
}
