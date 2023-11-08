package Week3.day3;

public abstract class JavaConnection implements DatabaseConnection  {

	@Override
	public void connect() {
		System.out.println("connect the Database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect the Database");
			
		
	}
	public void executeUpdate() {
		System.out.println("Execute the updated database");
	}





}
