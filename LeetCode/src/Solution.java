public class Solution {

    /**
     * 最小字串
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * @param s
     * @return
     * 无重复字符的最长子串
     */
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            String currentStr = s.substring(i,i+1);
            for(int j=i+1;j<s.length();j++){
                char n = s.charAt(j);
                currentStr = s.substring(i,j);
                if(currentStr.indexOf(n) != -1){//包含
                    currentStr = s.substring(i,j);
                    break;
                }else{
                    currentStr = s.substring(i,j+1);
                }
            }
            if(result<currentStr.length())result=currentStr.length();
        }
        return result;
    }

    public static void main(String[] arg){
        String[] array = new String[]{"au","abcabcbb","bbbbb","pwwkew"};
        for(String s:array){
            System.out.println(s+":"+lengthOfLongestSubstring(s));
        }
    }
}
