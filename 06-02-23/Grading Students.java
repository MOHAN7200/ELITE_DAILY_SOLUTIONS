//Grading Students


class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<Integer>();
        for(Integer val:grades){
            if(val>=38 && (5-(val%5))<3)
                res.add(val+(5-(val%5)));
            else
                res.add(val);
                
        }
        return res;

    }

}
