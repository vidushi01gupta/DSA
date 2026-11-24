class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String row[]=new String[numRows];
        for(int i=0;i<numRows;i++){
            row[i]="";
        }
        int currrow=0;
        int dir=0;
        for(int i=0;i<s.length();i++){
            row[currrow]=row[currrow]+s.charAt(i);
            if(currrow==0){
                dir=1;
            }
            else if(currrow==numRows-1){
                dir=-1;
            }
            currrow=currrow+dir;
        }
        String result = "";
        for (int i = 0; i < numRows; i++) {
            result = result + row[i];
        }
        return result;
    }
}