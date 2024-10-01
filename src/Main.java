//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CarrotSeller CarrotSeller1 = new CarrotSeller();
        CarrotSeller CarrotSeller2 = new CarrotSeller();

        CarrotSeller1.setName("Karel");
        CarrotSeller1.setAddress("Praha 6");
        CarrotSeller2.setName("Jirka");
        CarrotSeller2.setAddress("Brno");
        System.out.println(CarrotSeller1.getName());
        System.out.println(CarrotSeller1.getAddress());
        System.out.println(CarrotSeller2.getName());
        System.out.println(CarrotSeller2.getAddress());
    }
}