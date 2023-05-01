1)Write a Java program in which a total of 4 threads should run. Set different priorities for the thread.
1)
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " " + currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class main {
    public static void main(String[] args) {
        System.out.print("Name - Tapas Chatterjee \nRoll No - 19\n");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();


        thread1.setPriority(10);
        thread2.setPriority(7);
        thread3.setPriority(4);
        thread4.setPriority(1);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
     
    }



2)Write a Java Program to Create a Thread that Implements the Runnable Interface.

  class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MyThread {
    public static void main(String[] args) {
        System.out.print("Name - Tapas Chatterjee\nRoll No - 19\n");


        ThreadRunnable threadRunnable = new ThreadRunnable();
       Thread thread1 = new Thread(threadRunnable);


        thread1.start();
        System.out.println(thread1.getPriority());
        System.out.println(thread1.getName());
    }
}

3)Write a Java Program to Check the Priority Level of a Thread.
  
  import java.lang.*;  
  
public class ThreadPriority extends Thread   
{  
public void run()  
{  
System.out.println("Inside the run() method");  
}  

public static void main(String argvs[])  
{  
System.out.println("Name: Tapas Chatterjee, Roll No: 19");
 
ThreadPriority th1 = new ThreadPriority();  
ThreadPriority th2 = new ThreadPriority();  
ThreadPriority th3 = new ThreadPriority();  
  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
System.out.println("Priority of the thread th3 is : " + th2.getPriority());  

th1.setPriority(6);  
th2.setPriority(3);  
th3.setPriority(9);  
  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  
// Displaying name of the currently executing thread   
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  

Thread.currentThread().setPriority(10);  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  

4)Write a Java Program Defining Thread By Extending the Thread class.
  class MyThread extends Thread{  
public void run(){  
    for (int i=1;i<=3;i++ ){
        System.out.println(i+" "+"Thread is running...");  
    } 

}  
public static void main(String args[]){  
System.out.println("Name: Tapas Chatterjee,Roll :19");
MyThread t1=new MyThread();  
t1.start();  
 }  
}  

5)Write a Java Program to Get the Name of a Running Thread.
  class Threadname extends Thread{  
 public void run(){  
  System.out.println(Thread.currentThread().getName());  
 }  
 public static void main(String args[]){  
System.out.println("Name: Tapas Chatterjee,Roll :19");
  Threadname t1=new Threadname();  
  Threadname t2=new Threadname();  
  
  t1.start();  
  t2.start();  
 }  
}  

6)Write a Java Program to Stop a Thread.
public class StopThread extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                sleep(500);  
                System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {  
        System.out.println("Name: Tapas Chatterjee,Roll :19");
        
        StopThread t1=new StopThread ();    
        StopThread t2=new StopThread();   
        StopThread t3=new StopThread();   
         
        t1.start();  
        t2.start();  
        // stop t3 thread   
        t3.stop();  
        System.out.println("Thread t3 is stopped");    
    }    
}  


7)Write a Java Program to Check Whether Define a Thread Class 
 class ThreadWithoutRunMethod extends Thread {
    // no run() method defined
}

 public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Tapas Chatterjee,Roll :19");

        ThreadWithoutRunMethod thread = new ThreadWithoutRunMethod();
        thread.start();
    }
}


8)Write a Java Program to Show that Method Will be Verified Whether it is Synchronized or Not.

  public class SynchronizedMethod {

    // Synchronized method
    public synchronized void synchronizedMethod() {
        System.out.println("This is a synchronized method.");
    }

  
    public void nonSynchronizedMethod() {
        System.out.println("This is a non-synchronized method.");
    }

    public static void main(String[] args) {
         System.out.println("Name: Tapas Chatterjee,Roll :19");

       
        SynchronizedMethod obj = new SynchronizedMethod();

        obj.synchronizedMethod();

       
        obj.nonSynchronizedMethod();
    }
}


9)Create 4 threads with priority 1,3,5,7 respectively. Update a counter in each of the threads for 10 ms. Print the final value of the count for each thread.
  class Counter {
    private int count = 0;

    public synchronized void incrementer() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread1 extends Thread {
    Counter count;

    public MyThread1(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count.incrementer();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " finished. Count: " + count.getCount());
        }
    }
}

public class ThreadCounter {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name: Tapas Chatterjee,Roll :19");
        Counter countObj = new Counter();
        MyThread1 thread1 = new MyThread1(countObj);
        MyThread1 thread2 = new MyThread1(countObj);
        MyThread1 thread3 = new MyThread1(countObj);
        MyThread1 thread4 = new MyThread1(countObj);

        thread1.setPriority(1);
        thread2.setPriority(3);
        thread3.setPriority(5);
        thread4.setPriority(7);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(countObj.getCount());
    }
}

10)
  Write a Java Program to Use Method Level Synchronization.
  
  public class Synchronized {
    private int counter = 0;

    public synchronized void incrementCounter() {
        counter++;
        System.out.println("Counter value: " + counter);
    }

    public static void main(String[] args) {
        Synchronized obj = new Synchronized();
  System.out.println("Name: Tapas Chatterjee,Roll :19");
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    obj.incrementCounter();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    obj.incrementCounter();
                }
            }
        });

        t1.start();
        t2.start();
    }
}




For a  Mobile  Shop project


package Phone;
public class Telephone {
private int mobile_id;
private String model_name;
private int available_quantity;
public Telephone(int mobile_id, String model_name, int available_quantity) {
this.mobile_id = mobile_id;
this.model_name = model_name;

this.available_quantity = available_quantity;
}
public int getMobileId() {
return mobile_id;
}
public String getModelName() {
return model_name;
}
public int getAvailableQuantity() {
return available_quantity;
}
public void setAvailableQuantity(int available_quantity) {
this.available_quantity = available_quantity;
}
}
package Smart;
import Phone.Telephone;
public class SmartPhone extends Telephone{
private boolean enabled_5G;
private boolean foldable;
private boolean dual_screen;
public SmartPhone(int mobile_id, String model_name, int available_quantity, boolean
enabled_5G, boolean foldable, boolean dual_screen) {
super(mobile_id, model_name, available_quantity);
this.enabled_5G = enabled_5G;
this.foldable = foldable;
this.dual_screen = dual_screen;
}

public boolean is5GEnabled() {
return enabled_5G;
}
public boolean isFoldable() {
return foldable;
}
public boolean isDualScreen() {
return dual_screen;
}
public void displayDetails() {
System.out.println("Mobile ID: " + getMobileId());
System.out.println("Model Name: " + getModelName());
System.out.println("Available Quantity: " + getAvailableQuantity());
System.out.println("5G Enabled: " + (enabled_5G ? "Yes" : "No"));
System.out.println("Foldable: " + (foldable ? "Yes" : "No"));
System.out.println("Dual Screen: " + (dual_screen ? "Yes" : "No"));
}
}
package Smart;
import java.util.Scanner;
import Smart.SmartPhone;
public class Driven {
public static void main(String[] args) {
System.out.println("Name : Tapas Chatterjee Roll No: 19");
Scanner sc = new Scanner(System.in);
SmartPhone[] smartPhones = new SmartPhone[3];
smartPhones[0] = new SmartPhone(1, "iPhone XR", 10, true, false, false);
smartPhones[1] = new SmartPhone(2, "Galaxy S21", 15, true, false, false);

smartPhones[2] = new SmartPhone(3, "Pixel 6", 20, true, false, false);

int choice;

do {
System.out.println("1. Display Smart Phone Details");
System.out.println("2. Update Quantity");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();

switch (choice) {
case 1:
displaySmartPhoneDetails(smartPhones);
break;
case 2:
updateQuantity(smartPhones, sc);
break;
case 3:
break;
default:
System.out.println("Invalid choice! Try again.");
}
} while (choice != 3);
}

public static void displaySmartPhoneDetails(SmartPhone[] smartPhones)

{

System.out.println("Mobile ID\tModel Name\tAvailable Quantity\tEnabled

5G\tFoldable\tDual Screen");

for (SmartPhone smartPhone : smartPhones) {
System.out.println(smartPhone.getMobileId() + "\t\t" +

smartPhone.getModelName() + "\t\t" +

smartPhone.getAvailableQuantity() + "\t\t" + smartPhone.is5GEnabled() +

"\t\t" +

smartPhone.isFoldable() + "\t\t" + smartPhone.isDualScreen());
}
}

public static void updateQuantity(SmartPhone[] smartPhones, Scanner sc)

{

System.out.print("Enter the mobile ID: ");
int mobileId = sc.nextInt();
for (SmartPhone smartPhone : smartPhones) {
if (smartPhone.getMobileId() == mobileId) {
System.out.print("Enter the new quantity: ");
smartPhone.setAvailableQuantity(sc.nextInt());
System.out.println("Quantity updated successfully!");
return;
}
}
System.out.println("Mobile ID not found!");
}

}
