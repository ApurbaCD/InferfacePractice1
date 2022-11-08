public class QuizRunner {
    public static void main(String[] args) {
        Quiz[] data=new Quiz[3];

        data[0]=new Quiz(9,"A+");
        data[1]=new Quiz(3,"B+");
        data[2]=new Quiz(4,"c+");
        System.out.println(Ca.avarage(data));
        System.out.println(Ca.Max(data));

    } 
}
