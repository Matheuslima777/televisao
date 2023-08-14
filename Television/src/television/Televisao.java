
package television;


public abstract class Televisao implements Controle {
    protected String marca;
    protected String modelo;
    protected int tamanho;
    protected boolean ligada;
    
    protected int mudarCanal;
    protected int volume;

    public Televisao(String marca, String modelo, int tamanho, boolean ligada, boolean desligada, int mudarCanal, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.ligada = ligada;
       
        this.mudarCanal = mudarCanal;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

  
   

    public int getMudarCanal() {
        return mudarCanal;
    }

    public void setMudarCanal(int mudarCanal) {
        this.mudarCanal = mudarCanal;
    }

   
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanho() {
        return tamanho;
    }

   

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

  
    
    
    @Override
    public void Ligar(Televisao Televisao) {
       if(ligada == true){
           System.out.println("A tv esta ligada");
       }else{
           System.out.println("ligando tv");
       }
    }

    @Override
    public void Desligar(Televisao Televisao) {
        if(ligada == true){
            System.out.println("Desligando tv");
        }else{
            System.out.println("...");
        }
    }


    

    @Override
    public void Canal(Televisao Televisao) {
        if(ligada == true){
        switch(mudarCanal){
            case 1: System.out.println("1"); break;
            case 3: System.out.println("3"); break;
            case 5: System.out.println("5"); break;
            case 7: System.out.println("7"); break;
            default: System.out.println("Não eh um canal valido");
        }
        }else{
            System.out.println("...");
        }  
    }

    @Override
    public void aumentarVol(Televisao Televisao) {
        if(ligada == true){
            volume ++;
            System.out.println(volume);
          
        }else{
            System.out.println("...");
        }
    }

    @Override
    public void diminuirVol(Televisao Televisao) {
       if(ligada == true){
       volume --;
       }else{
           System.out.println("...");
       }
    }

 
    


    
    @Override
    public String toString() {
        return  "\n Marca: " + marca 
                + "\n MODELO: " + modelo 
                + "\n Tamanho" + tamanho 
                + "\n Canal: " + mudarCanal
                + "\n Volume: " + volume ;
    }
    
    
    
}
