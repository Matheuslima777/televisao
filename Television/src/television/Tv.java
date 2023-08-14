
package television;


public class Tv extends Televisao {

    public Tv(String marca, String modelo, int tamanho, boolean ligada, boolean desligada, int mudarCanal, int volume) {
        super(marca, modelo, tamanho, ligada, desligada, mudarCanal, volume);
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
    public void Canal(Televisao Televisao) {
        super.Canal(Televisao); 
    }

   

    @Override
    public void Desligar(Televisao Televisao) {
        super.Desligar(Televisao);
    }

    @Override
    public void Ligar(Televisao Televisao) {
        super.Ligar(Televisao);
    }

    @Override
    public void aumentarVol(Televisao Televisao) {
        super.aumentarVol(Televisao);
    }

    @Override
    public void diminuirVol(Televisao Televisao) {
         super.diminuirVol(Televisao);
    }

    

   

    
    
}
