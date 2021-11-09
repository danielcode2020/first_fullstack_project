public abstract class LaptopForm {
    protected String name;
    protected String processor;
    protected int ram;
    protected double price;

    //constructor
    protected LaptopForm(String name,String processor,int ram,double price ){
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }
    abstract String category();

    public String getName(){
        return name;
    }
    public String getProcessor(){
        return processor;
    }
    public int getRam(){
        return ram;
    }
    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
