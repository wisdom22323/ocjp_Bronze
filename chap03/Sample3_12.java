class Sample3_12{
    public static void main(String[]args){
        int num = 2;
        switch (num){
            case 1 :
                System.out.println("numの値は１です");
                break;
            case 2 :
                System.out.println("numの値は２です");
                //break文がないため、次のdefaultの処理文も実行
                //numの値が１以外の場合の以下が実行される
            default:
                System.out.println("defaultです");
        }
    }
}