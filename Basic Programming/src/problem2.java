public class problem2 {
    public static void main (String[] args){
        int studentScore = 80;

        if(studentScore >=0 && studentScore<= 34){
            System.out.println("D");
        } else if (studentScore >= 35 && studentScore <= 49) {
            System.out.println("C");
        } else if (studentScore >=50 && studentScore <= 64) {
            System.out.println("B");
        } else if (studentScore >= 65 && studentScore <= 79) {
            System.out.println("B+");
        } else if (studentScore >=80 && studentScore <= 100) {
            System.out.println("A");
        } else System.out.println("Invalid");

    }
}
