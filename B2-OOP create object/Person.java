public class Person 
{
    protected String name;
    protected String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String str = "ten: " + name + "dia chi: " + address;
        return str;
    }

    public static void main(String[] args) {
        Person person = new Person("An", "HaNoi");
        System.out.println(person);
        person.setAddress("DongAnh - HaNoi");
        System.out.println("address is: " + person.getAddress());
    }
}
