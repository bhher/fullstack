package a0320;
public class Class3 {
    public static void main(String[] args) {
        
       //Card.width, Card.height 클래스변수여서 객체 생성없이 사용 가능.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        //객체 생성후 참조변수 c1을 사용
        Card c1 = new Card(); // c1 주소할당
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 5;
        System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 " + c1.width+ ", " + c1.height);
        System.out.println("c2는 " + c2.kind + "," + c2.number + "이며, 크기는 " + c2.width+ ", " + c2.height);

        System.out.println("c1의 width와 height 50, 80으로 변경합니다.");
        //c1.width = 50;
        //c1.height = 80;
        Card.width = 80;
        Card.height = 80;
        //이렇게 바꿔야함.


        System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 " + c1.width+ ", " + c1.height);
        System.out.println("c2는 " + c2.kind + "," + c2.number + "이며, 크기는 " + c2.width+ ", " + c2.height);




    }
}

class Card{
    String kind; //인스턴스 변수
    int number;
    static int width = 100;
    static int height = 80;
}
