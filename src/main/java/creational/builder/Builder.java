package creational.builder;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class Builder {

	public static void main(String[] args) {

		Computer expensiveComputer = new Computer.Builder().withMemoryType(Memory.SSD)
				.withProcColor(Proccessor.INTEL).withRAMType(RAM.KINGSTON).build();
		Computer cheapComputer = new Computer.Builder().withRAMType(RAM.SAMSUNG)
				.withProcColor(Proccessor.AMD).withMemoryType(Memory.HDD).build();
	}
}
