//Sales by Match



class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer,Integer>str=new HashMap<>();
        int count=0;
        int val=1;
        for(int i=0;i<ar.size();i++){
            if(str.containsKey(ar.get(i))){
                str.put(ar.get(i),(str.get(ar.get(i)))+1);
            }
            else
                str.put(ar.get(i),val);
        }
        for(Integer value: str.values())
            if(value>=2)
                count=value/2+count;
        return count;
    }

}