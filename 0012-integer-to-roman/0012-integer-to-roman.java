class Solution {
    public String intToRoman(int num) {
        int n = num;
        StringBuilder str = new StringBuilder();
        while(n>0){
            if(n>=1000){
                str.append("M");
                n=n-1000;
            }
            else if(n>=500){
                if(n>=900){
                    str.append("CM");
                    n-=900;
                }
                else{
                 str.append("D");
                    n-=500;
                }                    
            }
            else if(n>=100){
                if(n>=400){
                    str.append("CD");
                    n-=400;
                }
                else{
                 str.append("C");
                    n-=100;
                }
            }
            else if(n>=50){
                if(n>=90){
                    str.append("XC");
                    n-=90;
                }
                else{
                 str.append("L");
                    n-=50;
                }                    
            }
            else if(n>=10){
                if(n>=40){
                   str.append("XL");
                    n-=40;
                }
                else{
                 str.append("X");
                    n-=10;
                }
            }
            else if(n>=5){
                if(n>=9){
                    str.append("IX");
                    n-=9;
                }
                else{
                 str.append("V");
                    n-=5;
                }                    
            }
            else if(n>=1){
                if(n>=4){
                    str.append("IV");
                    n-=4;
                }
                else{
                 str.append("I");
                    n-=1;
                }
            }
        }
        return str.toString();
    }
}