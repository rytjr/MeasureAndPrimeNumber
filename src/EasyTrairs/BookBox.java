package EasyTrairs;

public class BookBox {
    private EasyTrairs[] books;   // Book 객체참조배열 선언
    private int size, cnt;       // 배열의 크기, 현재 등록된 책의 갯수
    private String label;
    public BookBox(int size, String label) {
        this.size = size;
        this.label = label;
        books = new EasyTrairs[size];  // size 변수에 있는 크기만큼 배열 생성
        cnt = 0;
    }
    public void addBook(String title, String author, String buyDate, int price) {
    	EasyTrairs book = new EasyTrairs(title, author, buyDate, price);
        books[cnt++] = book;
    }
    public void addBook(EasyTrairs book) {
        books[cnt++] = book;
    }
    public EasyTrairs get(int i) { return books[i]; }

    public void showAllBooks() {
        //for(int i=0; i<cnt; i++) books[i].show();
        for (EasyTrairs book : books)
            if (book != null) book.show();
    }

    public EasyTrairs findBook(String title) {
        /*
        for(int i=0; i<cnt; i++)
            if(books[i].getTitle().equals(title)) return books[i];*/
        for (EasyTrairs book : books)
            if(book.getTitle().equals(title)) return book;
        return null;
    }
    public int findLocation(String title) {
        for(int i=0; i<cnt; i++)
            if(books[i].getTitle().equals(title)) return i;
        return -1;
    }

    public int findAllBooks(String title, EasyTrairs[] list) {
    	
    	int i = 0;
    	
    	for(EasyTrairs book : books) {
    		if(book == null) {
    			break;
    		}
    		//if(book.getTitle().equals(title)) list[i++] = book; //책 주소를 배열에 저장
    		if(book.equalTitle(title)) list[i++] = book;
    	}
    	if(i > 0) return i;
    	else return -1;
    }
	public void deleteBook(String title) {
		//삭제할 책의 위치를 알아야 함
		int loc = findLocation(title);
		if(loc == - 1) {
			System.out.println("삭제할 책이 없습니다.");
			return;
		}
		//한 칸씩 앞으로 덮어쓰기
		cnt--;
		for(int i = loc; i < cnt; i++) {
			books[i] = books[i + 1];
		}
		
		
	}
}
