public class CI2 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        int[] s1Cnt=new int[128],s2Cnt=new int[128];
        for(int i=0;i<s1.length();i++){
            s1Cnt[s1.charAt(i)]++;
            s2Cnt[s2.charAt(i)]++;
        }

        for(int i=0;i<128;i++){
            if(s1Cnt[i]!=s2Cnt[i])
                return false;
        }
        return true;
    }
}
