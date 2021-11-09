public interface Account {
    public int MIN = 50;
    public String success = "Account successfully created ! ";
    public String err = "Could not activate account, min deposit is " + MIN + " $ or underaged (<18)";

    abstract boolean checkAge();
}
