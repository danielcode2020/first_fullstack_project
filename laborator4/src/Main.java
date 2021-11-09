import java.util.List;

public class Main {
    public static void main(String[] args){

        // polymorphism
        Education ed = new Master();
        System.out.println("Name : " + ed.getName() + ", duration : " + ed.time());
        ed = new Doctorate();
        System.out.println("Name : " + ed.getName() + ", duration : " + ed.time());
        ed = new License();
        System.out.println("Name : " + ed.getName() + ", duration : " + ed.time());

        // interface
        User u1 = new User("Daniel","Marandici",20,30);

        if ((u1.getDeposit()>=Account.MIN )&&(u1.checkAge())) {
            System.out.println(Account.success);
        }
        else{
            System.out.println(Account.err);
        }
        u1.setDeposit(50);

        if ((u1.getDeposit()>=Account.MIN )&&(u1.checkAge())) {
            System.out.println(Account.success);
        }
        else{
            System.out.println(Account.err);
        }

        //abstract class
        Lenovo len = new Lenovo("Thinkpad","i5",8,11000);
        Asus as = new Asus("Tuf","i9",16,22000);

        List<LaptopForm> laptopFormList = List.of(len,as);
        laptopFormList.forEach(laptopForm -> {
            System.out.println(laptopForm.toString());
            System.out.println(laptopForm.category());
        });



    }
}
