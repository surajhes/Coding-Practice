import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        String s1 = "suraj";
        String s2 = "jarusuraj";
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(n1+n2+n3);
        int length = lcs(s1,s2);
        System.out.println(length);
    }

    static int lcs(String s1, String s2){
        int length = 0;
        int dp[][] = new int[s2.length()+1][s1.length()+1];
        int col = s1.length()+1;
        int row = s2.length()+1;
        char first[] = s2.toCharArray();
        char second[] = s1.toCharArray();
        for(int i = 1;i < row;i++){
            for(int j = 1; j < col; j++){
                if(first[i-1] == second[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    int l1 = dp[i-1][j];
                    int l2 = dp[i][j-1];
                    dp[i][j] = Math.max(l1,l2);
                }
            }
        }
        length = dp[row-1][col-1];
        return length;
    }
}
