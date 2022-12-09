public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan (int jumlahKursi, int biaya) {
    super (jumlahKursi, biaya);
    this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Informasi SAMPAN Printed");
    }

    @Override
    public void berlayar(){
        System.out.println("berlayar SAMPAN Printed");
    }

    @Override
    public void berlabuh(){
        System.out.println("berlabuh SAMPAN Printed");
    }

    public void berlabuh(int jangkar){
        System.out.println("berlabuh2 SAMPAN Printed");
    }
}
