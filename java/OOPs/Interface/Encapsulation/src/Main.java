//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Details {
    private String name;
    private int age;
    private String phone;
    private String email;

    Details() {
        System.out.println("we are into default constructor");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
       return ("Name : " + name + "\n" + "Age : " + age + "\n" + "Email : " + email + "\n" + "Phone : " + phone);
    }
}

public class Main {
    public static void main(String[] args) {
        Details d1 = new Details();
        d1.setName("Mehul");
        d1.setAge(23);
        d1.setEmail("mailtomehulraj@gmail.com");
        d1.setPhone("6203159409");

        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getEmail());
        System.out.println(d1.getPhone());
        System.out.println(d1);
    }
}