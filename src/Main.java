public class Main {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        SimpleDate e = new SimpleDate(1, 7, 2009);
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
    }
}