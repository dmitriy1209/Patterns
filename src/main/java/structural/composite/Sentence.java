package structural.composite;

import java.util.List;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class Sentence extends LetterComposite {

	public Sentence(List<Word> words) {
		for (Word w : words) {
			this.add(w);
		}
	}

	@Override
	public void printThisAfter() {
		System.out.print(".");
	}
}
