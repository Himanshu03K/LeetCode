package Medium;/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0
 */


class Q7 {
    public int reverse(int x) {
        int y=Math.abs(x);
        long sum=0;
        while(y>0)
        {
            int r=y%10;
            sum=sum*10+r;
            y=y/10;
        }
        if((sum <= Math.abs(Integer.MAX_VALUE)) && (sum >= Math.abs(Integer.MIN_VALUE)))
        {

            if(x<0)
                return (int) (sum*(-1));
            else
                return (int) sum;
        }
        else
            return 0;
    }
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Medium.Q7 obj = new Medium.Q7();
//        System.out.println(obj.reverse(n));
//    }
}