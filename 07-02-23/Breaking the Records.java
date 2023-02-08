//Breaking the Records


class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer>dig=new ArrayList<Integer>();
        int min=scores.get(0),max=scores.get(0),min_count=0,max_count=0;
        for(int i=1;i<scores.size();i++){
            if(min>scores.get(i)){
                min=scores.get(i);
                min_count++;
            }
            else if(max<scores.get(i)){
                max=scores.get(i);
                max_count++;
            }
        }
        dig.add(max_count);
        dig.add(min_count);
        return dig;
        

    }

}