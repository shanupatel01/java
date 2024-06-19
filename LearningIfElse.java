public class LearningIfElse {
    public static void main(String[] args) {

        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;

        // if-else condition

        if(isSeniorCitizen) {
            System.out.println("Hello senior citizen");

        } else {
            if(isAnAdult) {
                System.out.println(("Hello Adult citizen"));

            } else {
                System.out.println("\n\n Hello child");




                //if-else ladder condition


                if(isSeniorCitizen) {
                    System.out.println("Hello senior citizen");

                } else if (isAnAdult) {
                    System.out.println("Hello Adult");
                } else {
                    System.out.println("Hello child");
                }
            }
        }

    }
}



