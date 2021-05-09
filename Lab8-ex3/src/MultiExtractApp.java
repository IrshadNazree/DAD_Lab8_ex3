
public class MultiExtractApp {
	public static void main(String[] args) {
		Runnable text = new MultiExtractPrint();
		Runnable word = new MultiExtractPrint();
		
		Thread textThread = new Thread(text,"text");
		Thread wordThread1 = new Thread(word,"word1");
		Thread wordThread2 = new Thread(word,"word2");
		
		textThread.start();
		wordThread1.start();
		wordThread2.start();
	}
}
