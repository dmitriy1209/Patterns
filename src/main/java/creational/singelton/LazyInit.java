package creational.singelton;

/**
 * This is the type of thread safety singleton
 * 
 * @author softgroup_dmitriy
 *
 */

 class LazyInit {

	private static LazyInit instance;

	private LazyInit() {}

	public static synchronized LazyInit getInstance() {
		if (instance == null) {
			instance = new LazyInit();
		}
		return instance;
	}

}
