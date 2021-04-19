class Sample4_7{
    public static void main(String[]args){
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        for (char c:array){ 
            //char型のarray配列に格納されている要素を格納するため、char型でc変数を宣言
            System.out.print(c+" ");
        }
        System.out.println();
        for (int count = 0; count<array.length; count++){
            System.out.print(array[count]+" ");
        }
    }
}