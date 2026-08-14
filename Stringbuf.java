public class Stringbuf {
    public static void main(String[] args) {
        String name = "Santhosh";
        StringBuffer sb = new StringBuffer(name);

        // sb.append("Nerella");
        // System.out.println(sb);
        // System.out.println(sb.toString());

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(4));
        System.out.println(sb.isEmpty());
        System.out.println(sb.substring(5));


    }
    
}
