public class Main {
    public static void main(String[] args) {
        Data[] data=new Data[3];
        data[0]=new Data(9);
        data[1]=new Data(3);
        data[2]=new Data(4);
        System.out.println(DataProcess.avarage(data));
        System.out.println(DataProcess.Max(data));

    }
}
