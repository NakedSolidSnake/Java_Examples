import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestPostRequest {

	@Test
	void test() {
		String json = "{\n" + "\"userI\": 101,\r\n" +
		        "    \"id\": 101,\r\n" +
		        "    \"title\": \"Test Title\",\r\n" +
		        "    \"body\": \"Test Body\"" + "\n}";
		
		String endpoint = "https://jsonplaceholder.typicode.com/posts";
		
		try {
			 assertEquals(true, Request.Post(endpoint, json));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RequestException("Error cannot post the data");
		}	
	}

}
