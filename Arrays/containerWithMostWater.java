import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int mostWater(ArrayList<Integer>height)
    {
        int lp = 0;
        int rp = height.size()-1;
        int mostWater = 0;
        while(lp < rp)
        {
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            mostWater = Math.max(mostWater, currWater);

            //update pointers
            if(height.get(lp) < height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return mostWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
       System.out.println(mostWater(height));
    }
}
