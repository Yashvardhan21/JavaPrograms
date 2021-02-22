package Arrays_and_string;

public class PalindromeSubstrings {

	public static int countPalindromeSubstrings(String s) {

        int mid=0;

        int c=0;
        int n=s.length();
        while(mid<n){
            int i=mid-1;
            int j=mid+1;
            c++;
            while (i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                c++;
                i--;
                j++;
            }
            mid++;

        }
        int m[]=new int [2];

        for (int i=0;i<n;i++){
            if (i+1<n && s.charAt(i)==s.charAt(i+1)){
                m[0]=i;
                m[1]=i+1;
                c++;
                int a=m[0]-1;
                int b=m[1]+1;
                while (a>=0 && b<n && s.charAt(a)==s.charAt(b)){
                    c++;
                    a--;
                    b++;
                }
            }

        }
        return c;

    }
}



/*Sample Input :
aba
Sample Output :
4
**Note : Here 4 corresponds to ("a","b","a","aba").
**/
