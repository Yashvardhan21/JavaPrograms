package Recursion2;

public class Flag {

	public static long find_Ways(int N)
    {
        return find_Ways(N,'B','S');


    }

    public static long find_Ways(int N,char prev, char prevprev){
        if(N==1){
            return 1;
        }
        if(prev=='B' && prevprev!='R' && prevprev!='W'){
            return find_Ways(N-1,'W','B')+find_Ways(N-1,'R','B'); 
        }


        if(prev=='B' && prevprev=='R'){
            prevprev='B';
            prev='W';
            return find_Ways(N-1,prev,prevprev);
        }
        if(prev=='B' && prevprev=='W'){
            prevprev='B';
            prev='R';
            return find_Ways(N-1,prev,prevprev);
        }

        if(prev=='W'){
            return find_Ways(N-1,'B','W')+find_Ways(N-1,'R','W');
        }
        if(prev=='R'){
            return find_Ways(N-1,'B','R')+find_Ways(N-1,'W','R');
        }
        return 0;
    }
}

/*Sample Input 1 :
3
Sample Output 1 :
4
Sample Output 1 Explanation :
Possible flags with 3 stripes are : WRW, WBR, RWR, RBW
Sample Input 2 :
4
Sample Output 2 :
6
Sample Output 2 Explanation :
Possible flags with 4 stripes are : WRWR, WRBW, WBRW, RWRW, RWBR, RBWR*/

