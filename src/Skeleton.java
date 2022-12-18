public class Skeleton extends Boss{
    public int arrowAmount;

    public int getArrowAmount() {
        return arrowAmount;
    }

    public void setArrowAmount(int arrowAmount) {
        this.arrowAmount = arrowAmount;
    }

    public String printSkeletonInfo(){
        return "Name: " + this.heroType + "\nHealth: " + this.health + "\nDamage: " + this.damage + "\nAmmount of arrows: " + this.arrowAmount ;
    }
}
