package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 abstract class LetterComposite {

	private List<LetterComposite> children = new ArrayList();

	public void add(LetterComposite letter) {
		children.add(letter);
	}

	public int count() {
		return children.size();
	}

	public void printThisBefore() {};

	public void printThisAfter() {};


	public void print() {
		printThisBefore();
		for (LetterComposite letter : children) {
			letter.print();
		}
		printThisAfter();
	}
}
