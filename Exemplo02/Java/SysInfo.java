
public class SysInfo {

	static {
		try {
			System.loadLibrary("SysInfo");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static native String getString(String s);
	public static native int getInt(int i);
	public static native Float getFloat(Float f);
}
