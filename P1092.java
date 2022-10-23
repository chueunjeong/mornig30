import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
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
        
        //먼저, 크레인과 박스들 정렬
        Arrays.sort(craneList);
        Arrays.sort(boxWeightList);
        

        //Creating a stack 
        Stack<Integer> STACK = new Stack<Integer>(); 
  
        //Adding array to stack 
        for(Integer boxWeight : boxWeightList) STACK.add(boxWeight);
        
        //이동 횟수용 변수
        int moveCount=0;

        
        
        return 0;

    }
}
