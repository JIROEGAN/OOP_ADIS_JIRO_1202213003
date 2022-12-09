public class MainApp {
  public static void main (String[] args) throws exception {
    
    System.out.println("Transportasi Air");
    TransportasiAir transr = new TransportasiAir (360, 50000);
    transr.informasi();
    transr.berlayar();
    transr.berlabuh();

    System.out.println("Sampan");
    Sampan samp = new Sampan (25, 20000, 5);
    samp.informasi();
    samp.berlayar();
    Samp.berlabuh();
    samp.berlabuh(2);

    System.out.println("Kapal");
    Kapal kpl = new Kapal (500, 90000, Piston);
    kpl.informasi();
    kpl.berlayar();
    kpl.berlayar(50);
    kpl.berlabuh();
  }  
}