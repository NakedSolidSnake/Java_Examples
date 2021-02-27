import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class Request {
	public static boolean Post(String endpoint, String jsonMessage) throws IOException {
		boolean isOK = false;
		URL url = new URL(endpoint);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		
		connection.setDoOutput(true);
		OutputStream os = connection.getOutputStream();
		os.write(jsonMessage.getBytes());
		os.flush();
		os.close();
		
		int responseCode = connection.getResponseCode();
	    System.out.println("POST Response Code :  " + responseCode);
	    System.out.println("POST Response Message : " + connection.getResponseMessage());

	    if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	        		connection.getInputStream()));
	        String inputLine;
	        StringBuffer response = new StringBuffer();

	        while ((inputLine = in .readLine()) != null) {
	            response.append(inputLine);
	        } in .close();

	        // print result
	        isOK = true;
	    } else {
	        System.out.println("POST NOT WORKED");	        
	    }
		
	    return isOK;
	}
	
	public static String Get(String endpoint) throws IOException {		
		String readLine = null;
		StringBuffer response = null;
		URL url = new URL(endpoint);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Content-Type", "application/json"); 
		
		if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			response = new StringBuffer();
			while ((readLine = in.readLine()) != null) {
				response.append(readLine);
			}
			in.close();
			
		} else {
			System.out.println("GET NOT WORKED");
		}
		
		return response.toString();

	}
	
}
