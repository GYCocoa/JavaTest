import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
//        System.out.println("请输入内容：");
//
//        Scanner scanner = new Scanner(System.in);
//
//        if (scanner.hasNextLine()){
//            System.out.println("输出内容："+scanner.nextLine());
//        }
//
//        scanner.close();

//        int res = max(10,20);
//        System.out.println(res);

        int[] array = new int[10];
        for (int i = 0;i < 10;i++){
            array[i] = 10 + i;
        }
        System.out.println(array[5]);



    }

    public static int max(int a,int b){

        int result = 0;
        if (a == b){
            return  0;
        }else if (a > b){
            result = a;
        }else {
            result = b;
        }

        return result;
    }


}
