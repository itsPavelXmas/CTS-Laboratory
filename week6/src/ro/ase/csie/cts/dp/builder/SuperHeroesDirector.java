package ro.ase.csie.cts.dp.builder;

public class SuperHeroesDirector {
    SuperHero.SuperHeroBuilder builder;

    public SuperHeroesDirector(SuperHero.SuperHeroBuilder builder){
        this.builder=builder;
    }

    public SuperHero buildJoker(){
        return builder.isVillain().addLeftWeapon(new Pistol()).addRightWeapon(new Pistol()).build();
    }
    public SuperHero buildSuperMan(){
        return builder.addSuperPower("Fly").build();
    }
}
