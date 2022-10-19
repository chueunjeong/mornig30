import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1439 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int result=getMinimal(sc.nextLine());
            System.out.println(result);
        }

       
    }

    public static int getMinimal(String s){
        
        if(s.length()==1) return 0;

        List<String> bundleZeroToOne=new ArrayList<String>();
        for (String piece : s.split("")) {
            if(bundleZeroToOne.size()==0) bundleZeroToOne.add(piece);
            else{
                //마지막 기록한 값과 현재 값이 같은 지 확인
                String lastData=bundleZeroToOne.get(bundleZeroToOne.size()-1);
                if(!lastData.equals(piece)) bundleZeroToOne.add(piece);
            }
        }
       
        Map<String, Long> counts =
        bundleZeroToOne.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        //다 같은 숫자면 비교할 필요 없음
        if(counts.size()==1) return 0;
        else{

        int result=Long.compare(counts.get("0"), counts.get("1"));

        if(result<=0) return counts.get("0").intValue();
        else return counts.get("1").intValue();
        }
    }
}
