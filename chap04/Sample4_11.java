class Sample4_11{
    public static void main(String[]args){
        loop1:
        for (int x = 0; x<3; x++){
            for (int y = 0; y<3; y++){
                System.out.println("X = "+x+" y = "+y);
                if (x == 1 && y == 1){
                    System.out.println("break文の実行");
                    break loop1;
                }
            }
        }
        System.out.println("---------------------------");
        loop2:
        for (int x = 0; x<3; x++){
            for (int y = 0; y<3; y++){
                System.out.println("x = "+x+" y = "+y);
                if (x == 1 && y == 1){
                    System.out.println("continue文の実行");
                    continue loop2;
                }
            }
        }
    }
}

/* 
ラベルはbreakやcontinue文で対象となる繰り返し文に付ける名前です。
ラベルで囲まれているブロックから抜けることができる。
*/