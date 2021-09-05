package chapter1;
class CI4{
    public String compressString(String S) {




        StringBuffer stringBuffer=new StringBuffer("");
        
        int len=S.length();


        int cnt=1;
        for(int i=0;i<len;i++){
            if(i==len-1||S.charAt(i)!=S.charAt(i+1)){
                stringBuffer.append(S.charAt(i));
                stringBuffer.append(String.valueOf(cnt));
                cnt=1;
            }
            else{
                cnt++;
            }
        }
        return stringBuffer.length()<len?stringBuffer.toString():S;
    }


}