package ro.ase.cts.lab5.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		
		DbConnection dbCon1=DbConnection.getConnection("127.0.0.1", "localDb");
		DbConnection dbCon2=DbConnection.getConnection("127.0.0.1", "localDb");
		DbConnection dbCon3=DbConnection.getConnection("10.0.0.1", "prodDb");
		
		if(dbCon1==dbCon2) {
			System.out.println("They are the same");
		}
		if(dbCon1 !=dbCon3) {
			System.out.println("They are different");
		}
	}

}
