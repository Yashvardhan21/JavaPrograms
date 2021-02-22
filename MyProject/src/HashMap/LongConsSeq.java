package HashMap;


import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList; 
public class LongConsSeq { 
    // Longest Consecutive Increasing Sequence 
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        Map<Integer, Boolean> visitedElements = new HashMap<>(); 
        Map<Integer, Integer> elementToIndexMapping = new HashMap<>();
        for(int i = 0; i < arr.length; i++) { 
            int num = arr[i]; elementToIndexMapping.put(num, i);
            if(!visitedElements.containsKey(num)) { 

                visitedElements.put(num, false);
            } 
        }
        ArrayList<Integer> longestSequence = new ArrayList<>(); 
        int globalMaxSequenceLength = 1; int globalMinStartIndex = 0; 
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int currentMinStartIndex = i;
            int count = 0; int tempNum = num; 
            //Forward 
            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){ 
                visitedElements.put(tempNum, true); //Mark Visited elements in the array as true 
                count++;
                tempNum++; 
            
            } //Backward 
            tempNum = num-1; 
            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum, true); //Mark Visited elements in the array as true 
                count++;
                currentMinStartIndex = elementToIndexMapping.get(tempNum); tempNum--;
            } 
            if(count > globalMaxSequenceLength){ 
                globalMaxSequenceLength = count;
                globalMinStartIndex = currentMinStartIndex;
            }
            else if(count == globalMaxSequenceLength) {
                if(currentMinStartIndex < globalMinStartIndex) { 
                    globalMinStartIndex = currentMinStartIndex; 
                } 
            } 
        } 
        int globalStartNum = arr[globalMinStartIndex]; 
        longestSequence.add(globalStartNum); 
        globalMaxSequenceLength--; 
        while(globalMaxSequenceLength != 0) {
            globalStartNum++; 
            longestSequence.add(globalStartNum); 
            globalMaxSequenceLength--;
        } return
            longestSequence;
    }
}


/*Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 
9 
10 
11 
12
Sample Input 2 :
7
3 7 2 1 9 8 41
Sample Output 2 :
7
8
9
Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], but output should be [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array.
Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 
16*/