package ch6;//메서드명 : max
//        기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
//        만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//        반환타입 : int
//        매개변수 : int[] arr - 최대값을 구할 배열

class Exercise6_23{
    public static int max(int[] arr) {
        if ((arr == null)){
            int max_num = -999999;
        }
        int max_num = 0;
        int temp = 0;
        for (int a : arr) {
            if(a > max_num){
                temp = max_num;
                max_num = a;
                a = temp;
            }
        }
        if ((arr == null) || (max_num == 0)){
            max_num = -999999;
        }
        return max_num;
    }
    public static void main(String[] args)
    {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}