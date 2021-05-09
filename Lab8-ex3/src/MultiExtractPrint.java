import java.util.Random;

public class MultiExtractPrint implements Runnable{
	private String[] words = {"It","is","recommended","to","use","calender","class"};
	public void statementPrint() {
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		Random rand = new Random();
		
		if (currentThread.getName() == "text") {
			for (int i = 0; i < words.length; i++) {
				String txt = words[i].substring(1);
				System.out.println(txt);
			}
			System.out.println();
		}else if(currentThread.getName() == "word1"){
			try {
				for (int i = 0; i < words.length; i++) {
					int randomIndexToSwap = rand.nextInt(words.length);
					String temp = words[randomIndexToSwap];
					words[randomIndexToSwap] = words[i];
					words[i] = temp;
				}
				for (int i = 0; i < words.length; i++) {
					System.out.println(words[i]);
				}
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(currentThread.getName() == "word2"){
			for (int i = 0; i < words.length; i++) {
				int randomIndexToSwap = rand.nextInt(words.length);
				String temp = words[randomIndexToSwap];
				words[randomIndexToSwap] = words[i];
				words[i] = temp;
				
			}
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
		}
	}
}
