package Mk.JD2_95_22.fitness.servise.my_exeption.page;

import io.jsonwebtoken.JwtException;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;

public class PageNotFoundExeption extends RuntimeException{
    public PageNotFoundExeption(){};
    public PageNotFoundExeption(String message) {
        super(message);
    }
}
