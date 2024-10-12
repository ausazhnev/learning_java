public class beer_song {
    public static void main(String[] args) {
        int beer_num = 99;
        String word = "";
        System.out.print(beer_num);
        System.out.println(word);
        while (beer_num > 0) {
            if ((beer_num % 10 == 1) || (beer_num == 1)) {
                word = "бутылка";
            } else {
                word = "бутылок";
            }
            System.out.println(beer_num + " " + word + " пива на стене.");
            System.out.println(beer_num + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beer_num = beer_num - 1;
            if (beer_num == 0) {
                System.out.println("Нет бутылок пива на стене!!!");
            }
        }

    }
}