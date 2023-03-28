package array_addition;
// import java scanner package
import java.util.Scanner;
public class Array_addition {
    //create instance variable
    int a[]=new int[10];

    // method to input elements into the array
public void data_fill(){
    Scanner in=new Scanner(System.in);
    for(int i=0;i<10;i++){
        System.out.println("enter element");
       this.a[i]=in.nextInt(); 
    }
}
// method to add the array and to call the method to display the final array
public void add(Array_addition a, Array_addition b){
    for(int i=0;i<10;i++){
        this.a[i]=a.a[i]+b.a[i];
    }
    System.out.println("final array is ");
    this.display();
}
// method to display the final array
public void display(){
    for(int i=0;i<10;i++){
        System.out.println(this.a[i]);
    }
}
// main method to create objects and call methods
    public static void main(String[] args) {
        Array_addition a=new Array_addition();
        Array_addition b=new Array_addition();
        System.out.println("fill array A");
        a.data_fill();
        System.out.println("fill array B");
        b.data_fill();        
        Array_addition c=new Array_addition();
        c.add(a,b);
    }
}