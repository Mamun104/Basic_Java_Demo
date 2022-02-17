package string_loop;

/*5. <html>
<body>
<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>
</body>
</html>
Extract only transaction ID from the HTML*/

public class Program_5 {
    public static void main(String[] args) {
        String html="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        int pos=html.indexOf("TXN");
        System.out.println(html.substring(pos,72));

    }
}
