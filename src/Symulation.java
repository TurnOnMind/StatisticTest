import java.util.ArrayList;

public class Symulation {

  private int symCycle = 0;
  private ArrayList<Blop> blops = new ArrayList<Blop>(); 
  private int blopCount;
  private int cheaterCount;

  //Constructors

  public Symulation(int blopsValue){
    for (int i = 0; i < blopsValue; i++){
      this.addRandom();
    }
  }

  //Methods

  public void nextRoll(){
    for (Blop blop : blops) {
      blop.rollEvent();
    }
    symCycle++;
  }

  public void currentState(){
    System.out.println(symCycle + ". " + this.getCheaterCount());
  }

  public int getBlopsCount(){
    return blopCount;
  }

  public int getCheaterCount(){
    this.countCheaters();
    return cheaterCount;
  }

  public ArrayList<Blop> getBlops(){
    return blops;
  }

  private void countCheaters(){
    cheaterCount = 0;
    for (Blop blop : blops) {
      if(blop.isCheater())
      cheaterCount++;
    }
  }

  public void remove(int index) {
    if(blops.get(index).isCheater())
    cheaterCount--;
    blops.remove(index);
    blopCount--;
  }

  private void addRandom(){
    if(Math.random() < 0.5f)
      blops.add(new Blop());
    else
      blops.add(new Blop(true)); 
  }

  public void add(int value){
    for (int i = 0; i < value; i++) {
      this.addRandom();
    }
  }
}
