package pkg1;
/*
 * 정적메소드 안에서는 정적필드만 접근할 수 있음
 * 접근제어자 : private > default > protected   > public
 *           클래스내부   같은패키지  다른패키지-상속   모두허용
 */
public class DateUtil {
	
	//String date = "20210610";
	public static String curDate() {
	//	DateUtil dateUtil = new DateUtil();
		return "20120610";
	}

}
