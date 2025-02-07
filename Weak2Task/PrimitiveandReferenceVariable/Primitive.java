package Weak2Task.PrimitiveandReferenceVariable;

public class Primitive {
    public static void modifyValues(int num, int[] arr) {
        num = num + 10;
        arr[0] = arr[0] + 10;
        System.out.println("Inside method, Number:"+ num+" Array:"+arr[0]);
    }

    public static void main(String[] args) {
        int num=10;
        int[] arr={10,20,30};
        System.out.println("Before modify");
        System.out.println("Number:"+num);

        for (int i:arr)
            System.out.println(i);
        modifyValues(num,arr);

        System.out.println("After modify");
        System.out.println("Number:"+num);
        for (int i:arr)
            System.out.println(i);

    }
}
