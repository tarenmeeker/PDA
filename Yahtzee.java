public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    public Yahtzee(){
        this.die1 = new Die6();
        this.die2 = new Die6();
        this.die3 = new Die6();
        this.die4 = new Die6();
        this.die5 = new Die6();
        this.roll();
    }

    public void roll(){
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
}
