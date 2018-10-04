package structural.decorator;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

class SMSDecorator extends BaseDecorator {

	private String settings;

	public SMSDecorator(Notificator notificator) {
		super(notificator);

	}

	@Override
	public String send() {
		return setSMSSettings(super.send());
	}

	public String setSMSSettings(String str) {
		settings = "setting some configs for sms ";
		System.out.println(settings + str);
		return new String(settings + str);
	}
}
