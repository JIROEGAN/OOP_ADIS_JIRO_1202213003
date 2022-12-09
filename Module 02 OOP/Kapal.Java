public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal (int jumlahKursi, int biaya, String mesin){
        super (jumlahKursi, biaya, mesin);
    }

    @Override
    public void informasi(){
        System.out.println("Informasi KAPAL Printed");
    }

    @Override
    public void berlayar(){
        System.out.println("berlayar KAPAL Printed");
    }

    public void berlayar(int kecepatan){
        System.out.println("berlayar2 KAPAL Printed");
    }

    @Override
    public void berlabuh(){
        System.out.println("berlabuh KAPAL Printed");
    }
}