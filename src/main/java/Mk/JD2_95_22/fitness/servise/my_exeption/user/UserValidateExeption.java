package Mk.JD2_95_22.fitness.servise.my_exeption;

public class UserValidateExeption extends IllegalArgumentException{
    public UserValidateExeption(){};
    public UserValidateExeption(String message) {
        super(message);
    }
}
