class Sample4_3{
    public static void main(String[]args){
        int num = 0;
        do{
            System.out.println("numの値は"+num+"です。");
            num++;
        } while(num<5);
    }
}

/* 
条件判定がtrueである間、繰り返し処理が実行され、
条件判定がfalseになった時点でdo-while文は終了
*/