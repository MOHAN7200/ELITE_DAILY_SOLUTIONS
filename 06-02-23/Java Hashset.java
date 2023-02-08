//Java Hashset



HashSet<String> set = new HashSet();
        
        for(int i=0;i<t;i++){
            String str=pair_left[i]+" "+pair_right[i];
            set.add(str);
            System.out.println(set.size());
        }