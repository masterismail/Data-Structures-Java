public class Solution {
    public static int[] printNos(int x) {
       int staticNumber = 1;
       int[] resultList = new int[x];
        
        printNos(x);
        
        resultList[staticNumber-1] = staticNumber;
        staticNumber++; 
        
    
    for (int num:resultList){
        System.out.print(num + "");
    }
        return resultList;
    }


    public static void main(String[] args){
        printNos(5);
    }
}