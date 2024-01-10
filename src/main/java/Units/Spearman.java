package Units;
// Копейщик
public class Spearman extends Infantry {
    public Spearman() {
        super(15,5,2, new int[]{-1,-3});
    }

    @Override
    public void step() {

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
