
public class RealCostumer extends AbstractCostumer{
	
	public RealCostumer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
