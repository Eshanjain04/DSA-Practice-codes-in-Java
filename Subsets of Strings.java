class subSets{

    static void subsets(String s, String curr,int i){
        if(i==s.length()){
            System.out.print(curr+" ");
        }
        else{
            //this recursion takes empty string and first character of string
            subsets(s,curr,i+1);
            //this recrusion either add one string to previous empty stirng or not
            subsets(s,curr+s.charAt(i),i+1);
        }
    }
    public static void main(String[] args) {
        String curr ="";
        int i=0;
        subsets("ABC",curr,i);
    }
}
