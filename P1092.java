import java.util.Scanner;
import java.util.stream.Stream;

public class P1092 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            //크레인 수
            int craneNum=sc.nextInt();

            //크레인 제한 무게 목록
            String craneLimitWeightStr=sc.nextLine();
            int[] craneLimitWeightList=Stream.of(craneLimitWeightStr.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            //박스 수
            int boxesNum=sc.nextInt();

            //박스 무게 목록
            String boxesWeightListStr=sc.nextLine();
            int[] boxesWeightList=Stream.of(boxesWeightListStr.split(" ")).mapToInt(Integer::parseInt).toArray();

            int result=getNumberOfMoves(craneLimitWeightList,boxesWeightList);
            System.out.println(result);
        }
       
    }

    public static int getNumberOfMoves(int[] craneList, int[] boxWeightList){
        
        
        
        return 0;

    }
}
