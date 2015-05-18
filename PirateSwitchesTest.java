import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import org.junit.Assert;

class PirateSwitchesTest {

  private static int[] switches = new int[2];
  private static List<NTC> crew = new ArrayList<NTC>();
  private static TC tallyKeeper = new TC();

  public static void setup(){
    switches[0] = (int)Math.round(Math.random());
    switches[1] = (int)Math.round(Math.random());
    for (int i = 0; i < 22; i++){
      NTC ntc = new NTC();
      crew.add(ntc);
    }
    crew.add(tallyKeeper);
  }

  public static void main(String[] args){
    setup();
    test();
  }

  public static void test(){
    while (!tallyKeeper.done){
      crew.get((int)Math.floor(Math.random()*23)).flip(switches);
    }
    for (int i = 0; i < crew.size(); i++){
      Assert.assertTrue("All crew have gone in", crew.get(i).visited);
    }
  }

}
