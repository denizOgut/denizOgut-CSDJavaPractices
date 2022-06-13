package Entity;

import java.util.Random;

public class Stamp {
    public int val;

    public Stamp()
    {
       Random r = new Random();
        this.val = r.nextInt(1,100);
    }
}
