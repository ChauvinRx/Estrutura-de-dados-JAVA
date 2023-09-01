package Estojo;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    public int carga;
    boolean tampada;
    public boolean rabiscar;
    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
}
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        } if (this.carga <= 0){
        boolean rabiscar = this.rabiscar == false;
        System.out.println("Sem carga para escrever");
        } else if (this.tampada == false && this.ponta >= 0.5f) {
            this.setCarga(this.getCarga() - 10);
            System.out.println("Estou rabiscando");
        } else if (this.ponta < 0.5f) {
            System.out.println("ERRO! Caneta sem ponta para escrever");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean isRabiscar() {
        return rabiscar;
    }

    public void setRabiscar(boolean rabiscar) {
        this.rabiscar = rabiscar;
    }
    
    
}
