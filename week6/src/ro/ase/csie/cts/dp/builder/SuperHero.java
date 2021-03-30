package ro.ase.csie.cts.dp.builder;

public class SuperHero {
    String name;
    int lifePoints;
    boolean isVillain;
    boolean isWounded;


    WeaponInterface leftWeapon;
    WeaponInterface rightWeapon;

    String superPower;
    String superSuperPower;

    public SuperHero() {
    }

    public SuperHero(String name,
                     int lifePoints,
                     boolean isVillain,
                     boolean isWounded,
                     WeaponInterface leftWeapon,
                     WeaponInterface rightWeapon,
                     String superPower,
                     String superSuperPower)
    {
        this.name = name;
        this.lifePoints = lifePoints;
        this.isVillain = isVillain;
        this.isWounded = isWounded;
        this.leftWeapon = leftWeapon;
        this.rightWeapon = rightWeapon;
        this.superPower = superPower;
        this.superSuperPower = superSuperPower;
    }

    public void takesAHit(int points){
        this.lifePoints -=points;
        this.isWounded=true;
    }

    public static class SuperHeroBuilder extends SuperHero {
        private SuperHero superHero=null;
        public SuperHeroBuilder(String name, int lifePoints){
            superHero=new SuperHero();
            superHero.name=name;
            superHero.lifePoints=lifePoints;
        }

        public SuperHeroBuilder isVillain(){
            superHero.isVillain=true;
            return this;
        }

        public SuperHeroBuilder isWounded(){
            superHero.isWounded=true;
            return this;
        }

        public SuperHeroBuilder addLeftWeapon(WeaponInterface weapon){
            superHero.rightWeapon=weapon;
            return this;
        }
        public SuperHeroBuilder addRightWeapon(WeaponInterface weapon){
            superHero.rightWeapon=weapon;
            return this;
        }
        public SuperHeroBuilder addSuperPower(String superPower){
            superHero.superPower=superPower;
            return this;
        }
        public SuperHeroBuilder addSuperSuperPower(String superSuperPower){
            superHero.superSuperPower=superSuperPower;
            return this;
        }


        public SuperHero build() {
            return this.superHero;
        }
    }
}
