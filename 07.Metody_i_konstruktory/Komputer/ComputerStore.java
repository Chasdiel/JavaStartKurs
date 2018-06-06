class ComputerStore{
	public static void main(String [] args){
		Computer comp1 = new Computer("Intel i5", 8192);
		Computer comp2 = new Computer("AMD Ryzen 1700", 16384);
		
		comp1.printInfo();
		comp2.printInfo();
		//klient chce dodać jsezcze 4GB ram
		ComputerUpgrade upgrade = new ComputerUpgrade();
		upgrade.addMemory(comp1, 4096);
		
		comp1.printInfo();

	}
}	