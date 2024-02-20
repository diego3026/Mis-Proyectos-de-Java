
public class Main {

    public static void main(String[] args) {
        
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String nombre = "";
        
        
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = (int) (Math.random()*62);
            nombre += String.valueOf(banco.charAt(numeroAleatorio));
        }
        System.out.println(nombre.toLowerCase());
    }
    
}
