package a0410.market;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Market {

    public static Market instance;
    private Market(){};
    public static Market getInstance(){
        if (instance == null) {
            instance = new Market();
        }
        return instance;
    }
    ArrayList<String> marketList;
    ArrayList<Integer> marketPrice;
    Map<String, Integer> menu;

    public void getMmenu(){
        menu = new LinkedHashMap<String, Integer>();
        marketList = new ArrayList<>();
        marketPrice = new ArrayList<>();

        marketList.add("사과");
        marketList.add("오렌지");
        marketList.add("레몬");
        marketList.add("바나나");
        marketList.add("포도");
        marketList.add("토마토");

        marketPrice.add(3000);
        marketPrice.add(4000);
        marketPrice.add(2000);
        marketPrice.add(5000);
        marketPrice.add(3500);
        marketPrice.add(4500);

        for(int i = 0;i < marketList.size();i++){
            menu.put(marketList.get(i), marketPrice.get(i));
        }
        DecimalFormat f = new DecimalFormat("0,000원");
        StringBuffer st = new StringBuffer();
        st.append("\n\n")
          .append("+----------------메뉴판-----------------+\n")
          .append("|   Menu                         Price  |\n");
        System.out.println(st.toString());
        int s = 1;
        for(Entry<String, Integer> get : menu.entrySet()){
            System.out.printf("[%d] %-20s\t %s\n", s, get.getKey(), f.format(get.getValue()));
            s++;
        }
        System.out.println("+---------------------------------------+");
    }
}
