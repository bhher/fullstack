package a0319;

public class TopScore {
    public static void main(String[] args) {
        // 배열 생성
        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda",
                "Kate", "Alex", "Daniel", "Sam"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
        // 정부 배열 중 가장 큰 요소의 인덱스를 계산
        int i = topIndex(scores);

        //결과 출력 
        System.out.printf("1등 : %s(%d점)",names[i],scores[i]);
    }

    private static int topIndex(int[] arr) {
       int topIdx = 0; //가장 큰 갑스이 인텍스 초기화
       for (int i =0; i < arr.length ; i++){
        if(arr[topIdx] < arr[i]){
            topIdx = i; //topIdx를 i로 변경
        }
       }
       return topIdx; //가장큰 인덱스 번호를 반환
    }
}
