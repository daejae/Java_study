package Sol;

class Song{
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	public Song() {
		title = null;
		artist = null;
		album = null;
		composer = null;
		year = 0;
		track =0;
	}
	public Song(String title, String artist, String album, String[] composer , int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void showSong(){
		System.out.printf("타이틀 : %s\n가수 : %s\n앨범 제목 : %s\n", title, artist, album);
		for(int i=0; i<composer.length ; i++)
			System.out.println("작곡가 : "+ composer[i]);
		System.out.printf("발표 연도 : %d\n트랙번호 : %d\n", year, track);
	}
	
	
}
public class p235_01 {
	public static void main(String[] args) {
		String [] arr = {"dae", "jae", "lee"};
		Song song = new Song("Danccing Queen", "AABB", "asd", arr, 2016, 5);
		song.showSong();
		
	}

}
