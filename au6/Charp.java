class Charp{
    public static void main(String []args){
        char ch='a';
        String s="india";
        boolean b=false;
        for(char c:s.toCharArray()){
            if(c==ch){
                b=true;
                System.out.println("character  "+ ch + "  is found in  "+ s);
            }
        }
        if(!b){
            System.out.println("character  "+ch +"  is not found  "+s);
        }
    }
}