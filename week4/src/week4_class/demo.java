package week4_class;

public class demo {
    public static void main(String a[]) {
        advcal obj = new advcal();
       // veryadvcal obj = new veryadvcal();
        int r1 = obj.add(4, 5);
        int r2 = obj.sum(7, 3);
        int r3 = obj.multi(3, 5);
        int r4 = obj.div(12, 4);
      //  double r5 = obj.power(4, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " ");
    }
}
