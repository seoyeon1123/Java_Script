package Array;

public class ArrayDi0 {
    public static void main(String[] args) {
        //2x3 2차원 배열을만든다

        int [][] arr =  new int [2][3]; //행은 2, 열은 3

        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2; //0행 1열
        arr[0][2] = 3; //0행 2열
        arr[1][0] = 4; //1행 0열
        arr[1][1] = 5; //1행 1열
        arr[1][2] = 6; //1행 2열

        //0행
        System.out.print(arr[0][0] + ""); //0열 출력
        System.out.print(arr[0][1] + ""); //1열 출력
        System.out.print(arr[0][2] + ""); //2열 출력
        System.out.println(); //한행이 끝나면 라인 변경!

        //1행
        System.out.print(arr[1][0] + ""); // 0열 출력
        System.out.print(arr[1][1] + ""); // 1열 출력
        System.out.print(arr[1][2] + ""); // 1열 출력



    }
}
