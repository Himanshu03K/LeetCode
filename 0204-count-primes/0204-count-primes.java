class Solution {
    public int countPrimes(int n) {
        if(n==0 || n== 1 )
            return 0;
        return PrimeSieve(n);
    }

/* Sieve_of_Eratosthenes */

	public static int PrimeSieve(int n) {
    
    
    boolean[] prime = new boolean[n];
        //initialising notPrime with a value 1(counting "1" as not prime)
        int notPrime = 1;
        
        for(int i=2;i*i<n;i++){
            if(prime[i] == false){
                for(int j=i;j*i<n;j++){
                    if(prime[j*i] == false){
                        notPrime++;
                        prime[j*i] = true;
                    }
                }
            }
        }
        return n - notPrime - 1;
    }
}