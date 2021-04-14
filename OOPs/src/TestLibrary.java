import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {
 
	public static void main(String[] args) {
		Book bk = new Book(1234, "The Alchemist");
		Member mbr  = new Member (99,"Polo");
		Member mbr1  = new Member (91,"Pololol");
		
		bk.issueBook(mbr);
		
		bk.status();
		mbr.status();
		
		bk.issueBook(mbr);
		
		
//		bk.issueBook(mbr);
//		
		bk.returnBook(mbr1);
//		
//		bk.status();
//		mbr.status();
		
	}
}
