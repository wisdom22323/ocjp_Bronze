class Sample4_9{
    public static void main(String[]args){
        for (int i = 0; ; i++){
            if(i==3){
                break; //break文よりfor文から抜ける
            }
            System.out.println("i = "+i);
        }
        System.out.println("for文の後の処理");
    }
}