package Week3.day3;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("The output is: " +endpoint);
	}

public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The output is: " +endpoint +" " +requestBody +" " +requestStatus);
}

	public static void main(String[] args) {
		APIClient obj = new APIClient();
		obj.sendRequest("RequestSend");
		obj.sendRequest("Status", "RequestSend", true);

	}

}
