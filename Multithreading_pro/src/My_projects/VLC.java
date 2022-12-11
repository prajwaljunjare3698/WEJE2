package My_projects;
class audio extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("plying audio");
				Thread.sleep(400);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class video extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("plying video");
				Thread.sleep(400);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class caption extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("plying caption");
				Thread.sleep(400);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class timer extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("showing timer");
				Thread.sleep(400);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class VLC {	
	public static void main(String[] args) {
		audio t1 = new audio();
		t1.start();
		video t2 = new video();
		t2.start();
		caption t3 = new caption();
		t3.start();
		timer t4 = new timer();
		t4.start();
	}
}
