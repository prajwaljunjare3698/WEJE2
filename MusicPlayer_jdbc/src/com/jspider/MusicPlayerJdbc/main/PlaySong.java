package com.jspider.MusicPlayerJdbc.main;

public class PlaySong {
	public static void main(String[] args) {
		
		PlaySong p = new PlaySong();
		p.playSong();
	
	}

	private static void playSong() {
//		try {
//			FileInputStream music = new FileInputStream(new File("C:\\Users\\kisho\\Downloads\\Srivalli(PagalWorld).mp3"));
//			AudioInputStream audio = new AudioInputStream((TargetDataLine) music);
//			//AudioPlayer.player.start(audi);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		try{
//			  AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(this.getClass().getResource("C:\\Users\\kisho\\Downloads\\Srivalli(PagalWorld).mp3"));
//			  Clip clip = AudioSystem.getClip();
//			  clip.open(audioInputStream);
//			  clip.start();
//			 }
//			catch(Exception ex)
//			{ 
//				ex.printStackTrace();
//			}
		int i=2;
		if(i==1) {
			System.out.println("stop");
		}
		System.out.println("running");
		playSong();
		
	}
	
}



    