package string_loop;

//1 piece share 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.
//Find total price and total quantity using regular expression.

public class Program_4 {
    public static void main(String[] args) {
        String str = "1 piece share 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));

        double shareQuantity = Double.parseDouble(arr[0]);
        double sharePrice = Double.parseDouble(arr[1]);
        double shirtQuantity = Double.parseDouble(arr[2]);
        double shirtPrice = Double.parseDouble(arr[3]);
        double pantQuantity = Double.parseDouble(arr[4]);
        double pantPrice = Double.parseDouble(arr[5]);

        double totalQuantity = (shareQuantity + shirtQuantity + pantQuantity);
        double totalPrice = ((shareQuantity * sharePrice) + (shirtQuantity * shirtPrice) + (pantQuantity * pantPrice));

        System.out.println("Total quantity: "+totalQuantity);
        System.out.println("Total price: "+totalPrice);
    }
}
