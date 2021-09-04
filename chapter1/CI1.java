package chapter1;
class CI1{
    public boolean isUnique(String astr) {
        // 26 个小写字母，可以使用一个int进行位运算， 如果是128个字符，可以使用4个int进行位运算
        int mask=0;
        for(int i=0;i<astr.length();i++){
            int bit=1 << (astr.charAt(i)-'a');
            if((mask & bit) !=0)
                return false;
            mask = mask | bit;
        }
        return true;
    }
}
