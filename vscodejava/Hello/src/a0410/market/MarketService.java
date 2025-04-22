package a0410.market;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarketService {
    private boolean reOrder = false;
    private int orderNum = 1;
    Map<String, Integer> orderList = new HashMap<>();

    Market market = Market.getInstance();
    Customer customer;
    Thread t = new Thread();
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("\n어서오세요 OOO 주스입니다.");
        customer = new Customer(orderNum);
        market.getMmenu();
        order();
        totalOrder(customer);
        try {
            System.out.println("기다려 주시면 주문하신 상품이 나옵니다.");
            t.sleep(2000);
            end();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void end() {
        int s = 1;
        StringBuffer message = new StringBuffer();
        message.append("\n\n")
               .append(customer.getOrderNum() + " 고객님 주문하신 물건 나왔습니다.\n");
        System.out.println(message);
        for (Map.Entry<String, Integer> order : customer.getMarketOrder().entrySet()) {
            System.out.printf("[%d] %-20s : %2d개 %7s\n", s, order.getKey(), order.getValue(), "");
            s++;
        }
    }

    private void totalOrder(Customer customer) {
        int s = 1;
        int totalMoney = 0;
        int marketPrice = 0;
        DecimalFormat f = new DecimalFormat("###, 000");
        String name = customer.getOrderNum() + "번";
        StringBuffer message = new StringBuffer();
        message.append("\n\n")
               .append(name + "고객님의 주문 내역 입니다.\n");
        for(Map.Entry<String, Integer> order : customer.getMarketOrder().entrySet()){
            marketPrice = market.menu.get(order.getKey());
            String marketName = order.getKey();
            int orderCount = order.getValue();
            int marketUnitePrice = market.menu.get(marketName);
            marketPrice = marketUnitePrice * orderCount;
            totalMoney = totalMoney + marketPrice;
            String pay = f.format(marketPrice);
            message.append(String.format("[%d] %-20s : %2d개 %7s\n", s, marketName, pay));
            s++;
        }
        message.append("총 결제 금액은 " + f.format(totalMoney) + "입니다.\n");
        System.out.println(message);
        payment(totalMoney);
    }

    private void payment(int totalMoney) {
        System.out.println("결제를 도와 드리겠습니다. 카드를 넣어주세요");
        int payResult = customer.getMoney() - totalMoney;
        try {
            t.sleep(2000);
            System.out.println("결제 중입니다....");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (payResult < 0) {
            System.out.println("잔액이 부족합니다. 확인 후 다시 주문해주세요.");
        }else{
            customer.setMoney(payResult);
            System.out.println("결제가 완료 되었습니다.");
            System.out.println("이용해주셔서 감사합니다.");
            orderNum++;
        }
    }

    private void order() {
        System.out.println("\n 취소를 원하시면 0번을 눌러주세요.");
        end:while (true) {
            try{
                System.out.println("\n원하시는 과일의 번호를 선택해주세요 : ");
                String choice = sc.next();
                int choiceNum = Integer.parseInt(choice.substring(0, 1));
                if (choiceNum == 0) {
                    System.out.println("주문을 취소합니다.");
                    System.exit(0);
                }
                sc.nextLine();
                String marketName = market.marketList.get(choiceNum - 1);
                System.out.println("선택하신 물건은 : " + marketName + "입니다. 몇 개 주문하시겠습니까?");
                int orderCount = sc.nextInt();
                System.out.println(orderCount);
                sc.nextLine();
                if (reOrder) {
                    for(String mart : orderList.keySet()){
                        if (mart.equals(marketName)) {
                            int addCount = orderList.get(mart).intValue() + orderCount;
                            orderList.replace(marketName, addCount);
                        }else{
                            orderList.put(marketName, orderCount);
                            break;
                        }
                    }
                }else{
                    orderList.put(marketName, orderCount);
                }
                addOrder();
                customer.setMarketOrder(orderList);
                break end;
            }catch(Exception e){
                System.out.println("잘못된 선택입니다.");
                continue;
            }
        }
    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n주문을 계속하시겠습니까?");
        System.out.println("예(Y) / 아니오(N)");
        String yesOrno = sc.next();
        if (yesOrno.equals("예") || yesOrno.equalsIgnoreCase("y")) {
            market.getMmenu();
            reOrder = true;
            order();
        }else if(yesOrno.equals("아니오") || yesOrno.equalsIgnoreCase("n")){
            return;
        }
    }
    
}
