import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Harddisk
    public class Harddisk {
        String tipe;
        int kapasitas;

        Harddisk(String tipe, int kapasitas) {
            this.tipe = tipe;
            this.kapasitas = kapasitas;
        }

        public void getHarddiskInfo() {
            System.out.println("Tipe Harddisk: " + this.tipe );
            System.out.println("Kapasitas Harddisk :" + this.kapasitas + " GB");
        }
    }

    // inner class Motherboard
    public class Motherboard {
        String model;
        String chipset;

        Motherboard(String model, String chipset) {
            this.model = model;
            this.chipset = chipset;
        }

        public void getMotherboardInfo() {
            System.out.println("Model Motherboard: " + this.model);
            System.out.println("Chipset Motherboard: " + this.chipset);
        }
    }

    // inner class PowerSuply
    public class Powersupply {
        String merk;
        int watt;

        Powersupply(String merk, int watt) {
            this.merk = merk;
            this.watt = watt;
        }

        public void getPowersupplyInfo() {
            System.out.println("Merk Powersupply: " + this.merk);
            System.out.println("Daya Powersupply: " + this.watt + " Watt");
        }
    }

    // inner class VGACard
    public class VGACard{
        String model;
        int ukuran;

        VGACard(String model, int ukuran) {
            this.model = model;
            this.ukuran = ukuran;
        }

        public void getVGACardInfo() {
            System.out.println("Model VGACard: " + this.model);
            System.out.println("Ukuran Memori VGACard: " + this.ukuran + " GB");
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}