

//created by safiullah (2k22/ CSE/ 88)
//Date 8/10/2k22
//safiullahkalhoro@gmail.com

//Question no 4


//create a program in whic user is asked for marks in  a respected wyoming
//(metriculation ,intermediate and test result) where output would be the cpn



import java.util.Scanner;
class cpn{
public static void main(String[] org)
{
int metric;
int inter;
int test_res;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Metriculation Marks in percentage:");
metric=obj.nextInt();

System.out.println("Enter Intermediate Marks in percentage:");
inter=obj.nextInt();


System.out.println("Enter Test score Marks:");
test_res=obj.nextInt();

cpn=(metric/850)*10 + (inter/1100)*30 + (test_res/100)*44;


System.out.println("Cpn is:"+cpn);


}
}