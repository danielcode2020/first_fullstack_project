public class User implements Account{
    private String firstName;
    private String lastName;
    private int age;
    private double deposit;

    public User(String firstName,String lastName, int age,double deposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.deposit = deposit;
    }

    @Override
    public boolean checkAge(){
        return age>18;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public double getDeposit(){
        return deposit;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setAge(int age){
        this.age = age;
    }

    void setDeposit(double deposit){
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", deposit=" + deposit +
                '}';
    }
}
