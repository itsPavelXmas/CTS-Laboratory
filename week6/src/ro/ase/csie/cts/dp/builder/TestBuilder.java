package ro.ase.csie.cts.dp.builder;

public class TestBuilder {

    public static void main(String[] args){
//        //Create the object
//        SuperHero superHero=new SuperHero();
//        //Init the objeect
//        //TO DO : don t forgert
//        superHero.name="Superman";
//        superHero.lifePoints=100;
//        superHero.superPower="can Fly";
//        superHero.superPower="Laser eyes";

        //not CLEAN!
    SuperHero superman= new SuperHero.SuperHeroBuilder("Superman",100).
            addSuperPower("Fly").addLeftWeapon(new Pistol()).build();

    }


}
