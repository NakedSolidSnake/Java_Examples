public class CoarseGrainedObject {
	DependendObject1 do1 = new DependendObject1();
	DependendObject2 do2 = new DependendObject2();
	
	public void setData(String data1, String data2) {
		do1.setData(data1);
		do2.setData(data2);
	}
	
	public String[] getData() {
		return new String[] {do1.getData(), do2.getData()};
	}

}
