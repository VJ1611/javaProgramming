package javaProgramming;

interface Examples1{
    public void display1();
}
//second interface
interface Examples2 {
    public void display2();
}
//This interface is extending both the above interfaces
interface Examples3 extends Examples1,Examples2{
}
class Examples4 implements Examples3{
    public void display1(){
        System.out.println("display2 method");
    }
    public void display2(){
        System.out.println("display3 method");
    }
}
class Demo{
    public static void main(String args[]){
        Examples4 obj=new Examples4();
        obj.display1();
        //obj.display2();
    }
}
