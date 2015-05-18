public class NTC {
  public boolean visited = false;
  public void flip(int[] switches){
    if (switches[0] == 0){
      switches[0] = 1;
    } else if (switches[1] == 0)
      switches[1] = 1;
    else if (switches[1] == 1)
      switches[1] = 0;
    visited = true;
  }
}
