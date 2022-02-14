import java.util.Arrays;

public class DublicateEvenNumber {
    static boolean isFind(int []arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
           return false;
    }
    public static void main(String[] args) {
        int [] list={2,5,8,7,2,4,8,7,6,3,1,3,5,4,21,11};
        int [] dublicate=new int[list.length];
        int even=0;
        int startIndex=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j< list.length;j++){
                if((i!=j)&&(list[i]==list[j])){
                    if(list[i]%2==0){
                        if(isFind(dublicate,list[i])){}
                        dublicate[startIndex++]=list[i];
                        even++;
                }
            }
            }

        }
        System.out.println(Arrays.toString(dublicate));





    }

}
