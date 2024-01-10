package Units;

public class Archer extends Archers{
    public Archer(){
        super(15,5,2, new int[]{-1,-3});
        defense = 5;
    }
    private void reArm(){}
    private void fare(){}

    @Override
    public void step() {
        reArm();
        fare();
        System.out.println("Стреляю!");

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public String getInfo() {
        String s = this.getClass().getSimpleName() + ": " + this.name;
        return s;
    }
}