package chapter13;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("Korean");
		parser.parse("한글이 들어있는 파일.pdf");
		parser = ParserManager.getParser("English");
		parser.parse("영어가 들어있는 파일.pdf");
		
		
	} // end main
}
