class Sample3_10{
    public static void main(String[]args){
        int num = 20;
        String str = "value of num is ";
        str += num<10 ? "under 10" : "over 10";
        //文字列が+=演算子により、str変数に格納されていた「value　of　num」という文字列と結合された後、改めてstr変数に代入されます。
        System.out.println(str);
    }
}