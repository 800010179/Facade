package app;

public class HardDrive {

	private String data = "Pertun Data";
	
	public String Read(int lba, int size) {
		System.out.println("Luetaan data: " + data.substring(size, lba));
		return data.substring(size, lba);
	  }
	}
