class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int res=0;
        while(i<j){
            if(height[i]>height[j])
            {
res=Math.max(res,Math.min(height[i],height[j])*(j-1));
j-=1;
            }
            else
            {
                res=Math.max(res,Math.min(height[i],height[j])*(j-i));
                i+=1;

            }
        }
        return res;

    }
}

      
        