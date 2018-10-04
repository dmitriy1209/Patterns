package structural.decorator;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

class Messege implements Notificator {

	private String messege;

	public Messege(String message) {
		this.messege = message;
	}

	@Override
	public String send() {
		return messege;
	}
}
