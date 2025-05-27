class Scratch {
    public static String longestPrefix(String[] strs){
        if(strs == null && strs.length ==0){
            return ""; // if str is null return empty string
        }
        String prefix = strs[0];
        for(int i =1;i< strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() -1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;

    }


    public static void main(String[] args) {
        
        //indexOf(prefix)
        //substring(0,)
      String[] strings = {"fi","iooafi","fis","fir"};
      String ans = longestPrefix(strings);
      System.out.println(ans);

    }
}
