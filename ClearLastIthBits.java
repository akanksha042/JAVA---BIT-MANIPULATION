public class ClearLastIthBits {
    public static void main(String args[])
    {
        System.out.println(Cleatbitssss(15, 2));

    }    

    public static int Cleatbitssss(int n ,int i){
        int bitMAsk = ((-1)<<i);
        return n & bitMAsk;

    }
}
