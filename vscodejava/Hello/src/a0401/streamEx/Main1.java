package a0401.streamEx;

import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300)
            , new Transaction(raoul, 2012, 1000)
            , new Transaction(raoul, 2011, 400)
            , new Transaction(mario, 2012, 700)
            , new Transaction(mario, 2012, 700)        
            , new Transaction(alan, 2012, 950)
        );
//brian, mario 등은  거래자 , Combridege거래자가 근무하는 도시 
        //1. 2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬하시오
        practice1(transactions);
        //2.거래자가 근무하는 모든 도시를 중복없이 나열하시오
        practice2(transactions);
        //3. Combridege 에서 근무하는 보든 거래자를 찾아 이름순으로 정렬하시오
        practice3(transactions);
        //4. 밀라노엔 거래자가 있는가?
        practice4(transactions);
        //5. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        practice5(transactions);
        //6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
        practice6(transactions);
        //7. 최대값을 구하시오
        practice7(transactions);
        //7. 최소값을 구하시오
        practice8(transactions);
   
    }


    

 private static void practice8(List<Transaction> transactions) {
       Optional<Transaction> result = transactions.stream()
       .min(Comparator.comparing(Transaction::getValue));
       System.out.println(result);  //null이어도 Optional 감싸서 반환
       System.out.println(result.get().getValue());
    }

//최대값
 private static void practice7(List<Transaction> transactions) {
       Transaction result = transactions.stream()
        .max(Comparator.comparing(Transaction::getValue))
        .orElse(null); //값이 없으면 null반환    
        System.out.println(result);
    }




   //6. 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
   private static void practice6(List<Transaction> transactions) {
    List<String> result =   transactions.stream()
        .map(Transaction::getTrader)
        .map(Trader::getName)
        .distinct()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(result);
    }



 //5. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
 private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
            .collect(Collectors.toList());
            System.out.println(result);
    }




     //4. 밀라노엔 거래자가 있는가?
     private static void practice4(List<Transaction> transactions) {
        boolean result = transactions.stream()
            .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
            System.out.println(result);
    }

  //3. Combridege 에서 근무하는 보든 거래자를 찾아 이름순으로 정렬하시오
  private static void practice3(List<Transaction> transactions) {
       List<Trader> result = transactions.stream()
        .map(Transaction::getTrader) //Transaction 객체에서 거래자(Trader)정보만 가져옴
        .filter(trader -> ("Combridege").equals(trader.getCity()))
        .distinct()
        .sorted(Comparator.comparing(Trader::getName))
        .collect(Collectors.toList());
        System.out.println(result);
    }

 //2.거래자가 근무하는 모든 도시를 중복없이 나열하시오  
 private static void practice2(List<Transaction> transactions) {
       List<String> result = 
       transactions.stream()
        .map((tran)-> tran.getTrader().getCity())
        .distinct()
        .collect(Collectors.toList());
        System.out.println(result);
    }
 //tran(transactions) 객체를 입력받아서 
//.map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
//.map(Trader::getCity) //각 거래자에서 도시정보추출
        

    //1. 2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬하시오
    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = 
        transactions.stream()
            .filter(transaction -> 2011 == transaction.getYear())
            .sorted(Comparator.comparing(Transaction::getValue))
            .collect(Collectors.toList());
        System.out.println(result);  
        //   .sorted(Comparator.comparing(Transaction::getValue).reversed())내림차순
        //.sorted((tran1, tran2) -> Integer.compare(tran1.getValue(), tran2.getValue()))
  }
}