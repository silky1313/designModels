package io.silky;

public class OpenButton {
    private Cpu cpu;
    private HardDisk hardDiskl;
    private Memory memory;
    private OperatingSystem os;

    public OpenButton() {
        this.cpu = new Cpu();
        this.hardDiskl = new HardDisk();
        this.memory = new Memory();
        this.os = new OperatingSystem();
    }

    public boolean openComputer() {
        return cpu.run() & hardDiskl.read() & memory.checkMemory() & os.load();
    }
}
