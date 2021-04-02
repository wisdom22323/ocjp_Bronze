class Sample2_6{
    public static void main(String[]args){
        int i;
        //System.out.println("iの値：　"+i); Sample2_6.java:4: エラー: 変数iは初期化されていない可能性があります System.out.println("iの値：　"+i);

        int[] array = new int[5];
        System.out.println("array[0]の値：　"+array[0]);
        //System.out.println("array[5]の値：　"+array[5]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5 at Sample2_6.main(Sample2_6.java:7)   
    }
}