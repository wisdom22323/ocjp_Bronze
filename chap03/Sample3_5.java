class Sample3_5{
    public static void main(String[]args){
        int a = 10; int b = 10; int c = 10; int d = 10;
        
        boolean result1 = a++ > 10 & ++b > 10; //&演算子のため、両条件が評価
        System.out.println("result1 : "+result1+" a : "+a+" b : "+b);

        boolean result2 = a++ > 10 && ++b > 10; //&&演算子のため、a++>10が評価された時点でresult2に結果代入
        System.out.println("result2 : "+result2+" a : "+a+" b : "+b);
    }
}