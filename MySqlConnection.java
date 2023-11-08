package Week3.day3;

public  class MySqlConnection implements DatabaseConnection{


	@Override
	public void connect() {
		System.out.println(" Connect the SQL");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println(" Disconnect the SQL");
		
		
	}

	@Override
	public void executeUpdate() {
		System.out.println(" Execute the update in SQL");
		
	}

}
