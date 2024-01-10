package Units;

public class Monk extends Magicians{
    public Monk(){
        super(15,5,2, new int[]{-1,-3});
        defense = 5;
    }
    private void manaCast(){}
    private void manaAdd(){}


    @Override
    public void step() {
        manaCast();
        manaAdd();
        System.out.println("Заклинаю!");
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
