class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int d=temp%10;
            if(d!=0){
                sb.append(d);
                sum+=d;
            }
            temp/=10;
        }
        String r=sb.reverse().toString();
        if(r.equals("")){
            return 0;
        }
        long ans=Long.parseLong(r)*sum;
        return ans;
    }
}