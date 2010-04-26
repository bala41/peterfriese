package simple.ds.servlet;

import javax.servlet.ServletException;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public class SimpleComponent {
	
	private static final String SERVLET_ALIAS = "/hellods";
	private HttpService httpService;
	
	public void setHttpService(HttpService httpService) {
		this.httpService = httpService;
	}
	
	protected void startup() {
		try {
			System.out.println("Staring up sevlet at " + SERVLET_ALIAS);
			SimpleServlet servlet = new SimpleServlet();
			httpService.registerServlet(SERVLET_ALIAS, servlet, null, null);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (NamespaceException e) {
			e.printStackTrace();
		}
	}
	
	protected void shutdown() {
		httpService.unregister(SERVLET_ALIAS);
	}

}
