package creational.singelton;

/**
 * 
 * Eager initialization. The object is created when the class loads. The main disadvantage is the
 * object is created even the user don't use it
 * 
 * @author softgroup_dmitriy
 * 
 */
 class EagerInit {

	private static final EagerInit eagerInitInstance = new EagerInit();

	private EagerInit() {}

	public static EagerInit getInstance() {
		return eagerInitInstance;
	}
}
