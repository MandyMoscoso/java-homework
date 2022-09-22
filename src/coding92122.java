public class coding92122 {
    public static void main (String[] args) {
        double [] testArr = {0.0};
        double max = arrayMax(testArr);
        System.out.println(max);


    }
    public static double arrayMax(double [] array){
        double max = 0;
        if(array==null || array.length==0){
            return 0.0;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
