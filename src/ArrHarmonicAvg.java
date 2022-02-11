public class ArrHarmonicAvg {
    public static void main(String[] args) {
        int[] numbers={4,9,7,3,14,5,17};
        double sum=0.0;
        for (int i=0;i<numbers.length;i++){
            sum+=1/(numbers[i]+1.0);
        }

        double average=numbers.length/sum;
        System.out.println(average);

    }

}






