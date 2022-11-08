public class Quiz implements Measurable{
    int score ;
    String grade;
    int height;
    String name;

    public Quiz(int score,String grade) {
        this.score = score;
        this.grade =grade;
    }



    @Override
    public double getMeasure()
    {
        return score;
    }
    public String getMeasure2()
    {
        return grade;
    }
}
