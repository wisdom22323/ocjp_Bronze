class Sample3_13{
    public static void main(String[]args){
        int num = 3;
        switch(num){
            case 1:
            case 2:
                System.out.println("1 or 2");
                break;
            case 3: //case 3:に合。break文がないため11～12まで実行
            case 4:
                System.out.println("3 or 4");
                break;//このbreak文よりswitchblockからぬける
            default:
                System.out.println("default");
        }
    }
}