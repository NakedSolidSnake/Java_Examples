
public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Cricket Game initialized");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game started");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game finalized");
	}

}
