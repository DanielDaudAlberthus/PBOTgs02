public class Main {
    public static void main(String[] args) {
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk myHarddisk = myKomputer.new Harddisk("SSD", 512);

        CPU.VGACard myVGACard = myKomputer.new VGACard("NVIDIA GeForce GTX 1080", 8);

        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("ASUS ROG Strix Z390", "Intel Z390");

        CPU.Powersupply myPowersupply = myKomputer.new Powersupply("Corsair", 650);

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        myHarddisk.getHarddiskInfo();
        myVGACard.getVGACardInfo();
        myMotherboard.getMotherboardInfo();
        myPowersupply.getPowersupplyInfo();
    }
}
