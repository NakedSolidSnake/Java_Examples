
public class JMSService implements BussinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
