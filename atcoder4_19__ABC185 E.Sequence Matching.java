// ABC185 E.Sequence Matching

// 問題文はわかった

// 誰1 197ms/42,716KB
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int N=gi();
        int M=gi();
        int[] A=new int[N];
        int[] B=new int[M];
        for(int i=0;i<N;i++) {
            A[i]=gi();
        }
        for(int i=0;i<M;i++) {
            B[i]=gi();
        }

        int[][] dp=new int[N+1][M+1];
        for(int i=0; i<M+1;i++) {
            dp[0][i]=i;
        }
        for(int i=0; i<N+1;i++) {
            dp[i][0]=i;
        }
        for(int i=1; i<N+1;i++) {
            int a=A[i-1];
            for(int j=1; j<M+1;j++) {
                int b=B[j-1];
                dp[i][j]=dp[i-1][j-1];
                if(a!=b)dp[i][j]++;
                dp[i][j]=Math.min(dp[i][j], dp[i-1][j]+1);
                dp[i][j]=Math.min(dp[i][j], dp[i][j-1]+1);
            }
        }
        int ans=dp[N][M];
        System.out.println(ans);
    }


    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // intとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}


//　誰2 129ms,37,432KB
import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] A, B;

    public static void main(String[] args) {
        var sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(M);

        System.out.println(solve());
    }

    static int solve() {
        int[][] dp = new int[N+1][M+1];
        for (int[] each : dp) {
            Arrays.fill(each, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if( i < N ) {
                    dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]+1);
                }
                if( j < M ) {
                    dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j]+1);
                }
                if( i < N && j < M ) {
                    int a = A[i];
                    int b = B[j];
                    dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j] + (a == b ? 0 : 1));
                }
            }
        }

        return dp[N][M];
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            var a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            var a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            var a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        var pw = new PrintWriter(System.out);
        for (var a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        var pw = new PrintWriter(System.out);
        for (var a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        var pw = new PrintWriter(System.out);
        for (var i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static void debug(Object... args) {
        var j = new StringJoiner(" ");
        for (var arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
