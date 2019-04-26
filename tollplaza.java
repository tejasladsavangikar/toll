package toll;

import java.util.Scanner;

//class for queue1
class QN1
{
	private int arr[];
	private int capacity;
	private int front;
	private int rare;
	private int count;
	
	//constructor to initialised queue
	QN1(int size)
	{
		arr=new int[5];
		capacity=size;
		front=0;
		rare=-1;
		count=0;
	}
	//inserting into queue
	public void enqueue(int veh_no)
	{
		//check if q is full
		
		if(isFull())
		{
		System.out.println("Full");	
		}
		rare=(rare+1)%capacity;
		arr[rare]=veh_no;
		count++;
		
		
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int peek() {
		// TODO Auto-generated method stub
		return arr[front];
	}
	
	public void dequeue(int veh_no)
	{
		if(isEmpty())
		{
			System.out.println("EMPTY");
		}
		front=(front+1)%capacity;
		count--;
		
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}
	
}

class QV1
{
	private int arr[];
	private int capacity;
	private int front;
	private int rare;
	private int count;
	
	//constructor to initialised queue
	QV1(int size)
	{
		arr=new int[5];
		capacity=size;
		front=0;
		rare=-1;
		count=0;
	}
	//inserting into queue
	public void enqueue(int veh_no1)
	{
		//check if q is full
		
		//if(isFull())
		//{
		//System.out.println("Full");	
		//}
		rare=(rare+1)%capacity;
		arr[rare]=veh_no1;
		count++;
		
		
	}
	public void dequeue(int veh_no1)
	{
		front = (front + 1) % capacity;
		count--;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int peek() {
		// TODO Auto-generated method stub
		return arr[front];
	}
	
	
	
}


class vehicle{
	int veh_no;
	String veh_type;
	double arr_time;

	int veh_no1;
	String veh_type1;
	double arr_time1;

	
	public int getVeh_no() {
		return veh_no;
	}


	public void setVeh_no(int veh_no) {
		this.veh_no = veh_no;
	}

	public String getVeh_type() {
		return veh_type;
	}

	public void setVeh_type(String veh_type) {
		this.veh_type = veh_type;
	}
	public double getArr_time() {
		return  arr_time;
	}
	public void setArr_time(double  arr_time) {
		this.arr_time =  arr_time;
	}
	
	public int getVeh_no1() {
		return veh_no1;
	}


	public void setVeh_no1(int veh_no1) {
		this.veh_no1 = veh_no1;
	}

	public String getVeh_type1() {
		return veh_type1;
	}

	public void setVeh_type1(String veh_type1) {
		this.veh_type1 = veh_type1;
	}
	public double getArr_time1() {
		return  arr_time1;
	}
	public void setArr_time1(double  arr_time1) {
		this.arr_time1 =  arr_time1;
	}

}

public class tollplaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QN1 qn=new QN1(5);
		QV1 qv=new QV1(5);
		
		
		 Scanner sc=new Scanner(System.in);
		//int total=sc.nextInt();
		
		vehicle v=new vehicle();
		
		vehicle w=new vehicle();
		
		int waitingTime=0;

		v.setVeh_no(123);
		v.setVeh_type("Normal");
		v.setArr_time(10.00);
		
		w.setVeh_no1(234);
		w.setVeh_type1("VIP");
		w.setArr_time1(10.01);

		int veh_no = v.getVeh_no();
		String veh_type =v.getVeh_type();
		double arr_time=v.getArr_time();
		System.out.println(""+veh_no+"\t "+veh_type+"\t"+arr_time);

		int veh_no1 = w.getVeh_no1();
		String veh_type1 =w.getVeh_type1();
		double arr_time1=w.getArr_time1();
		System.out.println(""+veh_no1+"\t "+veh_type1+"\t"+arr_time1);

		
		
		if (v.veh_type=="Normal")
		{
		
			qn.enqueue(v.veh_no);
					System.out.println("front element in q is:"+qn.peek());
		}
		if(w.veh_type1=="VIP")
		{
			qv.enqueue(w.veh_no1);
			System.out.println("Front element in VIP q is:"+qv.peek());
		}
		
		//try{
			//Thread.sleep(110000);
			qv.dequeue(w.veh_no1);
			System.out.println("Front element in VIP q is:"+qv.peek());
		//}
		//catch(InterruptedException e)
		//{
			//System.err.println(e);
		//}
	}

}
