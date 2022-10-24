import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class P1092 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            //크레인 수
            int craneNum=Integer.parseInt(sc.nextLine());

           
             //크레인 제한 무게 목록
            String craneLimitWeightStr=sc.nextLine();

             int[] craneLimitWeightList=Stream.of(craneLimitWeightStr.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            //박스 수           
            int boxesNum=Integer.parseInt(sc.nextLine());

            //박스 무게 목록           
            String boxesWeightListStr=sc.nextLine();
            int[] boxesWeightList=Stream.of(boxesWeightListStr.split(" ")).mapToInt(Integer::parseInt).toArray();

            int result=getNumberOfMoves(craneLimitWeightList,boxesWeightList);
            System.out.println(result);
        }
       
    }

    public static int getNumberOfMoves(int[] craneList, int[] boxWeightList){
        
        //먼저, 크레인(내림차순)과 박스들(오름차순) 정렬
        Integer[] boxedCraneList = Arrays.stream( craneList ).boxed().toArray( Integer[]::new );
        Arrays.sort(boxedCraneList,Collections.reverseOrder());

        Arrays.sort(boxWeightList);
        

        //Creating a stack 
        Stack<Integer> STACK = new Stack<Integer>(); 
  
        //Adding array to stack 
        for(Integer boxWeight : boxWeightList) STACK.add(boxWeight);
        
        //이동 횟수용 변수
        int moveCount=0;

        //나오는 장치
        Boolean breakKey=true;

        if(STACK.peek()>boxedCraneList[0]) return -1;
        
        while(breakKey){
            for (Integer crane : boxedCraneList) {
                if(STACK.empty()) break;

                if(STACK.peek()<=crane) STACK.pop();
                else break;
            }

            moveCount++;
            
            if(STACK.empty()) breakKey=false;
        }        
        
        return moveCount;
    }
}
