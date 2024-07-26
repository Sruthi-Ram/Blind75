class Solution {
    static int getAngle(int H , int M) {
        // code here
        double hour=(double)(0.5*(60*H+M));
        double min=(double)(6*M);
        double res=Math.abs(hour-min);
        res=Math.min(360-res,res);
        return (int)Math.floor(res);
    }
};
