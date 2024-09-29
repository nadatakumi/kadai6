package syori;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sushi {
    private String greeting;
    private String foodName;
    private String foodType;
    private String currentDateTime;

    public Sushi() {
        this.greeting = "こんにちは！ここは日本です！";
        this.foodName = "寿司";
        this.foodType = "和食";
        // 現在の日時を取得して指定されたフォーマットに整形
        this.currentDateTime = getCurrentDateTime();
    }

    private String getCurrentDateTime() {
        // 現在の日時を yyyy/MM/dd HH:mm:ss フォーマットで取得
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

    // 各フィールドの値をコンソールに出力
    public void printDetails() {
        System.out.println(this.greeting);
        System.out.println("この " + this.foodName + " はうまい");
        System.out.println(this.foodName + " は " + this.foodType + " です");
        System.out.println("今の現在日時は " + this.currentDateTime + " です");
    }
}
