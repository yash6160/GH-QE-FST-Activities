public class Activity2 {
    public static void main(String []args){
        int []num={10, 77, 10, 54, -11, 10};
        int sum=0;
        for(Integer x:num){
            if(x==10){
                sum+=x;
            }
        }
       System.out.print(sum==30 ? "Yes" : "No");
    }
    
}
