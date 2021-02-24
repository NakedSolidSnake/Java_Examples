
public class BussinessLookup {
	public BussinessService getBussinessService(String serviceType) {
		if(serviceType.contentEquals("EJB")) {
			return new EJBService();
		}else {
			return new JMSService();
		}
	}	
}
