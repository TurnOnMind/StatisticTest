import java.util.ArrayList;
public class Blop {

  private float chance = 50.0f;
  private boolean isCheater = false;
  private ArrayList<Boolean> rollsResults = new ArrayList<Boolean>(); 

  //Constructors

  public Blop(){}

  public Blop(boolean IsCheater){
    if(IsCheater == true){
      chance += (float)Math.floor(Math.random()*50.0f)+1;
      isCheater = true;
    }
  }

  public Blop(float Chance){
    chance = Chance;
    isCheater = true;
  }

  //Methods

  public float getChance(){
    return chance;
  }
  
  public boolean isCheater(){
    return isCheater;
  }

  public void rollEvent(){
    if(Math.random()*101<=chance)
      rollsResults.add(true);
    else
      rollsResults.add(false);
  }

  public ArrayList<Boolean> getRollsResults(){
    return rollsResults;
  }
}
