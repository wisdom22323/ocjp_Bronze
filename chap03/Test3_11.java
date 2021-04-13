class Test3_11{
    public static void main(String[]args){
        int i = 0;
        //long i = 0;
        switch(i){
            case 10:System.out.print("case10");
            case 20:System.out.print("case20");
            case 30:System.out.print("case30");
            default:System.out.print("default");
        }
    }
}

/*
Test3_11.java:4: エラー: 不適合な型: 精度が失われる可能性があるlongからintへの変換
        switch(i){
              ^   
エラー1個

switch文：byte, char, short, int, enum, String
*/