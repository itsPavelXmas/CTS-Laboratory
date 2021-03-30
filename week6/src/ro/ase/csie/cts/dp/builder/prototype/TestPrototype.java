package ro.ase.csie.cts.dp.builder.prototype;

public class TestPrototype {
    Tree3DModel tree1=new Tree3DModel("Green",100);
    //Tree3DModel tree2=new Tree3DModel("Green",100);
    //ShallowCopy
    Tree3DModel anotherTree=tree1;

    //deep copy
  Tree3DModel tree2=(Tree3DModel) tree1.clone();
  Tree3DModel tree3=(Tree3DModel) tree1.clone();
  Tree3DModel tree4=(Tree3DModel) tree1.clone();

    public TestPrototype() throws CloneNotSupportedException {
    }
}
