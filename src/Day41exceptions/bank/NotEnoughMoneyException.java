package Day41exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        super("Not enough money in the account");
    }


}
