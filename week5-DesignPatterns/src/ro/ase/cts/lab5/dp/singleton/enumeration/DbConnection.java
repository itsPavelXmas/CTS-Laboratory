package ro.ase.cts.lab5.dp.singleton.enumeration;

//implement the Singleton as an enumeration
public enum DbConnection {

	  INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
