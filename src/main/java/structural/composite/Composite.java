package structural.composite;

/**
 *  
 * @author softgroup_dmitriy
 *
 */

 class Composite {
	public static void main(String[] args) {

		LetterComposite orcMessage = new Messenger().messageFromOrcs();
		orcMessage.print();

		LetterComposite elfMessage = new Messenger().messageFromElves();
		elfMessage.print();
	}
}
