import java.util.ArrayList;
import java.util.List;

public class P1439 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int getMinimal(String s){
        
        if(s.length()==1) return 0;

        List<String> bundleZeroToOne=new ArrayList<String>();
        for (String piece : s.split("")) {
            if(bundleZeroToOne.size()==0) bundleZeroToOne.add(piece);
            else{

            }
        }

        return 0;
    }
}
