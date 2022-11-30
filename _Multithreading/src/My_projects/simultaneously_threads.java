package My_projects;
class first extends Thread{
	public void run() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("first"+Thread.currentThread().getName());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class second extends Thread{
	public void run() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("second"+Thread.currentThread().getName());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class simultaneously_threads{
	public static void main(String[] args) throws InterruptedException {
		first t1 = new first();
		t1.start();
		second t2 = new second();
		t2.start();
	}
}