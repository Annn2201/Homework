public class NobodySpecial extends Humann implements Plumber, Electrician{
    public NobodySpecial(String name) {

    }


    public String unplugDrain() {
        return null;
    }


    public String changeBuld() {
        return null;
    }

    public String toString() {
        String str = "Nobody Special";
        return str;
    }

    public static void main(String[] args) {
        NobodySpecial ns = new NobodySpecial("AN");
        System.out.println(ns);
    }
}
