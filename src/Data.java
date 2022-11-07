public class Data implements Measurable {
    int x;

    public Data(int x){
        this.x=x;
    }
    @Override
    public double getMeasure() {
        return x;
    }

}
