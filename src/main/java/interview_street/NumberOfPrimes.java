package interview_street;

public class NumberOfPrimes {
	
	static int getNumberOfPrimes(int n) {
		if(n < 2) {
			return 0;
		}
		boolean[] isPrime = new boolean[n+1];
		for(int i=2;i<=n; i++) {
			isPrime[i] = true;
		}
		for(int i=2;i<=n; i++) {
			if(isPrime[i]) {
				for(int j=2*i;j<=n; j=j+i) {
					isPrime[j] = false;
				}
			}
		}
		int numberOfPrimes = 0;
		for(int i=2;i<=n; i++) {
			if(isPrime[i]) {
				numberOfPrimes++;
			}
		}
		return numberOfPrimes;
	}
	
	public static void main(String[] args) {
		System.out.println();
		

	}
}
