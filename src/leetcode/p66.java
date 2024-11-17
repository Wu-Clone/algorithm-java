package leetcode;

public class p66 {
    public int[] plusOne(int[] digits) {
        Boolean flag =true;
        for(int i = digits.length-1; i >= 0; i--){
            if(flag && digits[i]!=9){
                flag = false;
                digits[i]++;
                break;
            }else if(flag && digits[i] == 9){
                digits[i] =0;
            }
        }
        if(!flag) return digits;
        else{
            int[] res = new int[digits.length+1];
            for(int i = 0; i< digits.length;i++){
                res[i+1] = digits[i];
            }
            res[0]=1;
            return res;
        }
    }
}
