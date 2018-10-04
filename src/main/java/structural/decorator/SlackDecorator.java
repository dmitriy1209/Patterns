package structural.decorator;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

class SlackDecorator extends BaseDecorator {

	private String settings;

	public SlackDecorator(Notificator notificator) {
		super(notificator);
	}

	@Override
	public String send() {
		return setSlackSettings(super.send());
	}

	public String setSlackSettings(String str) {
		settings = "setting some configs for slack ";
		System.out.println(settings + str);
		return new String(settings + str);
	}
}
