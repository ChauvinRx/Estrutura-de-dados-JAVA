package Estojo;
public class Estojo {
     public static void main(String[] args) {
         Caneta c1 = new Caneta();
         c1.modelo = "Bic cristal";
         c1.cor = "Azul";
         c1.setPonta(0.5f);
         c1.carga = 80;
         c1.tampada = true;
         c1.status();
         c1.rabiscar();
         
         System.out.println("------------------------");
         
         Caneta c2 = new Caneta();
         c2.modelo = "Hostnet";
         c2.cor = "preta";
         c2.setPonta(1.5f);
         c2.tampada = true;
         c2.destampar();
         c2.status();
         c2.rabiscar();
         
         System.out.println("---------/------/--------");
         
         Caneta c3 = new Caneta();
         c3.modelo = "FaberCastel";
         c3.cor = "VerdeCana";
         c3.setPonta(4.4f);
         c3.carga = 100;
         c3.tampada = false;
         c3.status();
         c3.rabiscar();
         c3.rabiscar();
         c3.rabiscar();
         System.out.println(".");
         c3.status();
         
         System.out.println("---------/------/--------");
         
         Caneta c4 = new Caneta();
         c4.carga = 50;
         c4.cor = "vermelha";
         c4.modelo = "Polium";
         c4.tampada = false;
         c4.status();
         c4.rabiscar();
    }
    
}
