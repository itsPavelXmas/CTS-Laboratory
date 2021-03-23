package ro.ase.ctst.lab5.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		System.out.println("The app started");
		//DbConnection con1=new DbConnection();
		//DbConnection con2=new DbConnection();
		
		DbConnection con1= DbConnection.getDbConnection();
		DbConnection con2= DbConnection.getDbConnection();
		DbConnection con3= DbConnection.getDbConnection();
	}

}
