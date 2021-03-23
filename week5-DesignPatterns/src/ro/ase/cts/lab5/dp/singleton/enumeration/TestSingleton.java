package ro.ase.cts.lab5.dp.singleton.enumeration;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection singleton = DbConnection.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
	
	}

}
