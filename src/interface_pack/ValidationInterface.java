package interface_pack;

public interface ValidationInterface {

    public abstract boolean validationPassword(String password);

    public abstract boolean validationEmail(String email);

    public abstract boolean validationName(String name);
    
    public abstract boolean validationTelephone(String telephone);
}
