package a0327.exception1;

public class customException extends Exception {
    public customException(String message){
        super(message);
    }
}
//  customException  은 Exception (자바의 최상위 예외) 상속받아
//사용자 정의 예외
//생성자를 통해 예외 메세지를 전달할 수있습니다.