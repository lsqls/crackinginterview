package chapter1;

public class CI3 {
    public String replaceSpaces(String S, int length) {


        char[] chs=S.toCharArray();
        
        int i,j;
        for(i=length-1,j=chs.length-1;i>=0;i--,j--){
            if(chs[i]==' '){
                chs[j]='0';
                chs[--j]='2';
                chs[--j]='%';    
            }else{
                chs[j]=chs[i];
            }
        }

        return new String(chs, j + 1, chs.length - j - 1);

    }
}
