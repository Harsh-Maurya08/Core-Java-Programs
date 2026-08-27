class VarArgs {
    public static void main(String[] args){
        concatenate( "Harsh" , "Maurya" , "Is" , "Great");
    }
    public static void concatenate (String ...elements){
        for (String element : elements) {
            System.out.printf("%s", element);
        }
    }
}
