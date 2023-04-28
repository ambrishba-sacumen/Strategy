// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s="security";
        String [] arr=s.split("");
        for(int i=0;i< arr.length;i++)
        {
            if(i!=0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("java");
    }
}