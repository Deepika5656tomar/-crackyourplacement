class Solution {
    public int characterReplacement(String s, int k) {
        int[] mp=new int[26];
        int l=0;
        int r=0;
        int n=s.length();
        int maxlen=0;
        int maxf=0;
        while(r<n){
            mp[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,mp[s.charAt(r)-'A']);
            if((r-l+1)-maxf>k){
                mp[s.charAt(l)-'A']--;
                l=l+1;
            }
            if((r-l+1)-maxf<=k){
                maxlen=Math.max(maxlen,(r-l+1));
            }
            r++;
        }
        return maxlen;
    }
}
