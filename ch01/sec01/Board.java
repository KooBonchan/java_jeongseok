package ch01.sec01;

public class Board {
	private int id = 1;
	private String title = "title";
	private String content = "content";

	private Board() {
	}

	public static void main(String[] args) {
		Board board = new Board();
		System.out.println(board.id);
		System.out.println(board.title);
		System.out.println(board.content);
	}
}
