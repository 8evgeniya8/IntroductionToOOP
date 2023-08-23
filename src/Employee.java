public class Employee {
   private String surname;
   private final String name;
   private final String relatives;
    private String position;
    private String email;
    private String phone;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getRelatives() {
        return relatives;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String surname,
                    String name, String relatives,
                    String position, String email,
                    String phone, int age) {
        this.surname = surname;
        this.name = name;
        this.relatives = relatives;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println("Призвище : "+this.surname);
        System.out.println("Ім'я : "+this.name);
        System.out.println("По батькові : "+this.relatives);
        System.out.println("Посада : "+this.position);
        System.out.println("Email : "+this.email);
        System.out.println("Телефон : "+this.phone);
        System.out.println("Вік : "+this.age);
    }
}
