public class Blop {
  float chance = 50.0f;
  public Blop(boolean IsCheater){
    if(IsCheater == true){
      chance += (float)Math.floor(Math.random()*50.0f)+1;
    }else{
      chance = 50.0f;
    }
  }
  public Blop(float Chance){
    chance = Chance;
  }
}
