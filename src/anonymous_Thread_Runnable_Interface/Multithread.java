package anonymous_Thread_Runnable_Interface;

public class Multithread {

	public static void main(String[] args) {

		// Approach 01
		Thread thread=new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=0; i<5; i++) {

					System.out.println("Anonymous inner class method argument example- Approach 01");
				}

			}
		});
		thread.start();

		// Approach 02

		new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=0; i<5; i++) {

					System.out.println("Anonymous inner class method argument example - Approach 02");
				}

			}

		}).start(); 
	}
}
