
public class BussinessDelegate {
	private BussinessLookup lookupService = new BussinessLookup();
	private BussinessService bussinessService;
	private String serviceType;
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask() {
		bussinessService = lookupService.getBussinessService(serviceType);
		bussinessService.doProcessing();
	}
}
