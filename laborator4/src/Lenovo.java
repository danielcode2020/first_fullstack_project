public class Lenovo extends LaptopForm{
    public Lenovo(String name,String processor,int ram, double price){
        super(name, processor, ram, price);
    }

    @Override
    String category(){
        if ((price>10000)&& (price<20000) && (ram>4) && (ram<=8) && (processor=="i7") || (processor=="i5")){
            return "Professional";
        }
        else if ((price>20000) && (ram>=16) && (processor=="i9")){
            return "Premium";
        }
        else{
            return "Budget";
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
