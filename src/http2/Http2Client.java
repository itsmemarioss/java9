package http2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import jdk.incubator.http.*;

/**
 * HTTP2 Client uses jdk.incubator.httpclient
 *  
 * You have to add the module httpclient before compile and run 
 * 
 * java --add-modules jdk.incubator.httpclient
 * javac --add-modules jdk.incubator.httpclient
 * 
 * @author mario
 *
 */

public class Http2Client {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("http://www.turismonocariri.com.br/");
		HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
		
		System.out.println("http version: "	+	response.version());
		System.out.println("status code: "	+	response.statusCode());
		System.out.println("content: "	+	response.body());
	}

}
