class Solution {
    public static String freqAlphabets(String s) {
        StringBuffer st = new StringBuffer();
        for(int i = s.length()-1; i>=0; i--){
            int number;
            if(s.charAt(i)=='#'){
                number = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                i -= 2;
            }
            else{
                number = s.charAt(i) - '0';
            }
            st.append((char) (number + 96));
        }
        return st.reverse().toString();
    }
}