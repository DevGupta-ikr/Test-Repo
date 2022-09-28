import java.math.*;
import java.util.* ;
import java.io.* ;
@SuppressWarnings("unused")
//Scanner s = new Scanner(new File("input.txt"));
//s.close();
//PrintWriter writer = new PrintWriter("output.txt");
//writer.close();
public class cf
{	
	static long gcd(long a, long b){if (b == 0) {return a;}return gcd(b, a % b);}
	
	public static void main(String[] args)throws Exception
    {
		FastReader in = new FastReader() ;
//		FastIO in = new FastIO(System.in) ;
		StringBuilder op = new StringBuilder() ;
		int T = in.nextInt() ;
//		int T=1 ;
		for(int tt=0 ; tt<T ; tt++){
			//CODE :	
			
		}
		System.out.println(op.toString()) ;
    }
	static class pair implements Comparable<pair> {
		int first, second;
		pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
		@Override
		public int compareTo(pair other) {
			return this.first - other.first;
		}
		@Override
		public boolean equals(Object obj) {
			pair other = (pair)obj ;
			return this.first == other.first && this.second == other.second ;
		}
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	
	static class FastIO {
		
		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;

		public FastIO(String fileName) throws Exception {
			dis = new FileInputStream(fileName);
		}

		public FastIO(InputStream is) throws Exception {
			dis = is;
		}

		int nextInt() throws Exception {
			int ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		long nextLong() throws Exception {
			long ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		byte nextByte() throws Exception {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}

		String next() throws Exception {
			StringBuffer ret = new StringBuffer();

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}

			return ret.toString();
		}
		
		 int[] readArray(int n) throws Exception {
				int[] a=new int[n];
				for (int i=0; i<n; i++) a[i]=nextInt();
				return a;
			}
	}

	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble(){ return Double.parseDouble(next()); };
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
    }

}