import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestGetRequest {

	@Test
	void test() {
		String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
		String message = null;
		
		try {
			message = Request.Get(endpoint);
			assertEquals(true, message.length() > 0); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(message);
	}

}
