package app;

public class ComputerFacade {
	  private CPU cpu_;
	  private Memory memory_;
	  private HardDrive hard_drive_;
	  
	  private static final int kBootAddress = 0;
	  private static final int kBootSector = 4;
	  private static final int kSectorSize = 1;
	  
	  public void Start() {
		cpu_ = new CPU();
		memory_ = new Memory();
		hard_drive_ = new HardDrive();
	    cpu_.Freeze();
	    memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
	    cpu_.Jump(kBootAddress);
	    cpu_.Execute();
	  }
}
