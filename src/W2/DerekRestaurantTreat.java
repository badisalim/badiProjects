
package W2;

import java.util.Scanner;

public class DerekRestaurantTreat {

    public static void main(String[] args) {
        getMoney();

        Integer money = getMoney();
        //    Integer money1 = getMoney1();
        Integer debt = getFriendsDebt();
        //        Integer debt1 = getFriendsDebt1();
        concludeWhetherDerekCanTreatHisFriends(money, debt);
        //    concludeWhetherDerekCanTreatHisFriends1(money1, debt1);
    }

    private static Integer getMoney() {
        System.out.println("How much money do I have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //        private static Integer getMoney1() {
//            System.out.println("How much money1 do I have?");
//            Scanner scanner = new Scanner(System.in);
//            return scanner.nextInt();
//        }
    private static Integer getFriendsDebt() {
        Scanner scanner = new Scanner(System.in);
        Integer numberOfFriends = getNumberOfFriends();
        Integer debt = 0;
        for (int times = 0; times < numberOfFriends; times++) {
            System.out.println("How much do you have to pay?");
            Integer money = scanner.nextInt();
            debt = debt + money;
        }
        return debt;
    }
//        private static Integer getFriendsDebt1() {
//            Scanner scanner = new Scanner(System.in);
//            Integer numberOfFriends = getNumberOfFriends();
//            Integer debt1 = 0;
//            for (int times = 0; times < numberOfFriends; times++) {
//                System.out.println("How much do you have to pay?");
//                Integer money = scanner.nextInt();
//                debt1 = debt1 + money;
//            }
//            return debt1;
//        }

    public static Integer getNumberOfFriends() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many friends are here?");
        return scanner.nextInt();
    }

    private static void concludeWhetherDerekCanTreatHisFriends(Integer money, Integer debt) {
        boolean canInvite = money >= debt;
        if (!canInvite) {
            System.out.println("Sorry mates, I can't invite you today.");
            return;
        }
        System.out.println("You're all invited!");
        Integer myDebt = getMyDebt();
        canInvite = money >= debt + myDebt;
        if (!canInvite) {
            System.out.println("Sorry mates, I miscalculated! I can't invite you today.");
        }
    }

    //        private static void concludeWhetherDerekCanTreatHisFriends1(Integer money1, Integer debt1) {
//            boolean canInvite = money1 >= debt1;
//            if (!canInvite) {
//                System.out.println("Sorry mates, I can't invite you today.");
//                return;
//            }
//            System.out.println("You're all invited!");
//            Integer myDebt1 = getMyDebt();
//            canInvite = money1 >= debt1 + myDebt1;
//            if (!canInvite) {
//                System.out.println("Sorry mates, I miscalculated! I can't invite you today.");
//            }
//        }
    private static Integer getMyDebt() {
        System.out.println("How much money do I have to pay?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}



