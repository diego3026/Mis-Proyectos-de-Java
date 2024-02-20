package test;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public class Main {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        
        LocalDate fechaNacimiento = LocalDate.of(2002, 11, 25);
        System.out.println(YEARS.between(fechaNacimiento,hoy));
        
    }
}
