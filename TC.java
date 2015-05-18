public class TC extends NTC {
  public int count = 0;
  public boolean done = false;

  @Override
  public void flip(int[] switches){
    this.visited = true;
    if (switches[0] == 1){
      switches[0] = 0;
      count++;
    }
    else if (switches[1] == 0){
      switches[1] = 1;
    } else if (switches[1] == 1){
      switches[1] = 0;
    }
    if (count == 44){
      done = true;
    }
  }
}
