
package television;


public class Main {

   
    public static void main(String[] args) {
        Tv tele = new Tv("Samsung", "Galaxy", 32, true, false, 3, 5);
        
        tele.Ligar(tele);
        tele.Desligar(tele);
        
        tele.Canal(tele);
        
        tele.aumentarVol(tele);
        
    }
    
}
