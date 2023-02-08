//Apple and Orange



public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int count_apple=0,count_orange=0;
        List<Integer>arrapple=new ArrayList<>();
        List<Integer>arrorange=new ArrayList<>();
        for(Integer val:apples){
            arrapple.add(val+a);
        }
        for(Integer val:oranges)
            arrorange.add(val+b);
        for(Integer val:arrapple)
            if(val>=s&&val<=t)
                count_apple++;
        for(Integer val:arrorange)
            if(val>=s&&val<=t)
                count_orange++;
        System.out.println(count_apple);
        System.out.println(count_orange);
    }

}