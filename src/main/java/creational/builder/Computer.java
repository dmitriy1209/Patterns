package creational.builder;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class Computer {

	private final Memory memory;
	private final Proccessor proc;
	private final RAM ram;
	private final Drive drive;

	private Computer(Builder builder) {
		this.memory = builder.memory;
		this.proc = builder.proc;
		this.ram = builder.ram;
		this.drive = builder.drive;
	}

	public Memory getMemory() {
		return memory;
	}

	public Proccessor getProc() {
		return proc;
	}

	public RAM getRam() {
		return ram;
	}

	public Drive getDrive() {
		return drive;
	}

	public static class Builder {

		private Memory memory;
		private Proccessor proc;
		private RAM ram;
		private Drive drive;

		public Builder withMemoryType(Memory memoryType) {
			this.memory = memoryType;
			return this;
		}

		public Builder withProcColor(Proccessor procType) {
			this.proc = procType;
			return this;
		}

		public Builder withRAMType(RAM ramType) {
			this.ram = ramType;
			return this;
		}


		public Builder withDriverType(Drive driveType) {
			this.drive = driveType;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
