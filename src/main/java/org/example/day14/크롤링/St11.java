import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class St11 {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.11st.co.kr/products/2825921889").get();

        Elements list = doc.select("h1.title");
        String product = list.get(0).text();

        Elements list2 = doc.select("dd.rate span.value");
        String discount = list2.get(0).text();

        Elements list3 = doc.select("dd.price strong span.value");
        String price = list3.get(0).text();

        System.out.println("제품 이름: " + product);
        System.out.println("가격: " + price);
        System.out.println("할인율: " + discount + "%");
    }
}
