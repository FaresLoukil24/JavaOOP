package Exception;


import java.io.IOException;

public class TestFinally{



    public static void main(String[] args) throws IOException {
try {
    System.out.println("entrer votre code ");
    // traiter cette exception
    int x =   System.in.read();
}catch (Exception e){
    System.out.println("error");
}
        System.out.println("Merci de votre visite");
    }

}



