//M.S. Roeney Palessy_235150407111045_SI-C

package Hero;
public class Basic {
    private String name;
    private double health;
    private double attackPower;
    private double defensePower;

    public Basic(){
        this.name = "Hero";
        this.health = 100;
        this.attackPower = 10;
        this.defensePower = 5;
    }

    public Basic(String name, double health, double attackPower, double defensePower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setDefensePower(double defensePower) {
        this.defensePower = defensePower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public double getDefensePower() {
        return defensePower;
    }

    public void attack(Basic enemy) {
        enemy.setHealth(enemy.getHealth() - (this.attackPower - enemy.getDefensePower()));
    }

    public void display() {
        System.out.println("Name            : " + this.name);
        System.out.println("Health          : " + this.health);
        System.out.println("Attack Power    : " + this.attackPower);
        System.out.println("Defense Power   : " + this.defensePower);
    }
}
