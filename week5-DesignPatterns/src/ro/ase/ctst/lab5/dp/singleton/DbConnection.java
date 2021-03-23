package ro.ase.ctst.lab5.dp.singleton;

public class DbConnection {
	String socket;
	String schema;
	
	//version 1- eager approach (create the singleton when the class is loaded)
	//private static DbConnection dbConnection=new DbConnection(); //create the object
	
	//version 2- the lazy approach(
	private static DbConnection dbConnection=null;
	
	//class static initializer
	//uses the class lazy-loading approach
	static {
		//executed only once when the class is loaded by the JVM
		System.out.println("Loading database connection string");
	}
	
	//constructor initializer
	{
		
		//executed before each constructor call
		
		System.out.println("Init connection string");
	}
	
	private DbConnection() {
		System.out.println("Creating a DbConnection");
		//access a local settings file to get credentials and conn string
		//
	}

	private DbConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}
	
	// this makes the differences between versions
	//The method used to return the reference to the unique object
	public static DbConnection getDbConnection() {
		if(DbConnection.dbConnection==null) {
			//you can get details from files, etc
			dbConnection = new DbConnection();
		}
		return DbConnection.dbConnection;
	}
	

}
