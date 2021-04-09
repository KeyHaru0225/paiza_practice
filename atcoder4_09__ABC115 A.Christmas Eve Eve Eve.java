// ABC115 A.Christmas Eve Eve Eve


// 正解。87ms/31,568KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int d = Integer.parseInt(chr[0]);
          
            if(d == 25){
            	System.out.println("Christmas");
            } else if (d == 24){
                System.out.println("Christmas Eve");
            } else if (d == 23){
                System.out.println("Christmas Eve Eve");
            } else if (d == 22){
                System.out.println("Christmas Eve Eve Eve");
            } else {
            	System.out.println("");
            }
          
        }
    }
}


// 誰かの答え　79ms/32,332KB
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	private static final int INPUT_SIZE = 1;

	public static void main(String[] args) {

		FastScanner scanner = new FastScanner();

		int cnt = 0;
		int[] inputArray = new int[INPUT_SIZE];
		while (scanner.hasNext()) {
			inputArray[cnt] = scanner.nextInt();
			cnt++;
		}

		PrintWriter out = new PrintWriter(System.out);

		switch (inputArray[0]) {
		case 25:
			out.println("Christmas");
			break;
		case 24:
			out.println("Christmas Eve");
			break;
		case 23:
			out.println("Christmas Eve Eve");
			break;
		case 22:
			out.println("Christmas Eve Eve Eve");
			break;
		default:
			break;

		}
		out.flush();
	}

	private static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}

