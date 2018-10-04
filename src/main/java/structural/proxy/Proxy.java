package structural.proxy;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class Proxy {

	public static void main(String[] args) {
		ProxyService service = new ProxyService(new Service());
		service.save();
		service.read();
		service.write();

		service.save();
	}
}
