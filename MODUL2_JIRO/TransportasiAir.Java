public class TransportasiAir {
    protected int jumlahKursi, biaya;

    public TransportasiAir (int jumlahKursi,int biaya){
        this.jumlahKursi = jumlahKursi
        this.biaya = biaya
    }

    public void informasi(){
        System.out.println("Informasi TA Printed");
    }

    public void berlayar(){
        System.out.println("berlayar TA Printed");
    }

    public void berlabuh(){
        System.out.println("berlabuh TA Printed");
    }
}