package structural.decorator;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

class BaseDecorator implements Notificator {

	private Notificator wrapper;

	public BaseDecorator(Notificator notificator) {
		this.wrapper = notificator;
	}

	@Override
	public String send() {
		return wrapper.send();
	}
}
