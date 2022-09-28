public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super();
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        String str = "Student [ name = " + name + ", address = " + address +
                "], program = " + program + " year = " + year + " fee = " + fee;
        return str;
    }

    public static void main(String[] args) {
        Student student = new Student("An", "Hanoi", "cs", 3, 100);
        System.out.println(student);
        student.setFee(200);
        System.out.println("Fee is: " + student.getFee());
    }
}
