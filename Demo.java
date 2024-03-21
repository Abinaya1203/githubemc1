class Calculator{// design the stuffs--- properties and methods are done in this calculator
int a;// variable
    public int add(int num1,int num2){ // method // we want a return type so int is used
System.out.println("in add");// getting called or not
int r = num1+num2;
return r;// value is not concerned ---but how do i call add
}
}
public class Demo {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        Calculator calc= new Calculator();// obj is created like this
        //class name calculator //calc is the variable name where we can access the methods
        int result=calc.add(num1,num2);// calling the add method in calculator by passing two values
        System.out.println(result);
    }
}
//calc is variable