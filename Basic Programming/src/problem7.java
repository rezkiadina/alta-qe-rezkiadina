public class problem7 {
    private static float Mean(float[] numbers){
        int i;
        float total, rerata;

        total = 0;
        for(i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        rerata = (total/numbers.length);

        return rerata;

    }

    public static void main(String[] args){
        float[] value = {1, 2, 3, 4};
        System.out.println("Nilai mean = "+Mean(value));
    }
}
