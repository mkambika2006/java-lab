class WrongAge extends Exception{
    public WrongAge(String message){
        super(message);
    }
}
class father{
    int fatherAge;
    father(int age) throws WrongAge{
        if(age<0){
            throw new WrongAge("Father's age cannnot be negative:");
        }
        fatherAge=age;
        System.out.println("father's age:"+age);
    }
}
class Son extends father{
    int sonAge;
    Son(int fatherAge,int sonAge) throws WrongAge{
        super(fatherAge);
        if(sonAge>=fatherAge){
            throw new WrongAge("Son's Age cannot be greater,than or equal to father's age:");
        }
        this.sonAge=sonAge;
        System.out.println("Son's Age:"+sonAge);
    }
}
public class exception{
    public static void main(String args[]){
        try{
            Son s=new Son(4,15);
            Son s1=new Son(40,45);
        }
        catch(WrongAge e){
            System.out.println("Exception caught:"+e.getMessage());
        } 
    }
}
