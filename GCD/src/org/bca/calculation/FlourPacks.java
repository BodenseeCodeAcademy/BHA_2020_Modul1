package org.bca.calculation;

public class FlourPacks {

    public static void main(String[] args) {

        boolean isPack= canPack(0,10,8);
        System.out.println(isPack);
    }

    private static boolean canPack(int big, int small, int goal) {
        // big   = 5 kg
        // small = 1 kg
        // 5 * x + 1 * y=goal


        // big =5 small=0 goal  = 5   -->true
        // big =0 small=20 goal =10   -->true;

        if(big<0||small<0||goal<0){
            return false;
        }

//using only big packages
        if ((goal%5==0) && (big>=(int)goal/5)){
            return true;
        }

// using only small packages
        if(small>=goal){
            return true;
        }

        // using big and small packages
        // big= 3 small=3 goal =18

        for(int i=0;i<=big;i++){
            int pack=i*5;
//            System.out.println("i="+i+" pack="+pack+" kg");
//            System.out.println("goal-pack="+(goal-pack)+" kg");
            if(goal-pack <=small){
                return  true;
            }
        }
        return false;
    }
}
