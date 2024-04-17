package EasyTrairs;

import java.util.Scanner;

//프로젝트 메인클래스
public class BookManager {
 private static Scanner in = new Scanner(System.in);
 private static int size = 20;
 private static BookBox box = new BookBox(size, "Programming");
 private static void addBook() {
     while (true) {
         System.out.print("title : ");
         String title = in.next();
         if (title.equals("exit")) break;
         System.out.print("author : ");
         String author = in.next();
         System.out.print("buy date : ");
         String buyDate = in.next();
         System.out.print("price : ");
         int price = in.nextInt();
         box.addBook(title, author, buyDate, price);  // 책 추가 요청
         //box.addBook(new Book(title,author,buyDate,price));
     }
 }
 private static void findBook() {
     System.out.print("Book title : ");
     String title = in.next();
     EasyTrairs book = box.findBook(title);   //책하나를 받음
     if (book != null) book.show();
     // 책의 위치를 알아낸다.
     int pos = box.findLocation(title);
     if (pos != -1) box.get(pos).show();

     EasyTrairs[] list = new EasyTrairs[size];
     int cnt = box.findAllBooks(title, list);   //책 다받음
     System.out.println("검색된 책의 갯수 : " + cnt);
 }
 public static void main(String[] args) {
     while (true) {
         System.out.println("1. 도서등록");
         System.out.println("2. 도서목록");
         System.out.println("3. 도서검색");
         System.out.println("4. 도서변경");
         System.out.println("5. 도서삭제");
         System.out.println("0. 종료");
         int menu = in.nextInt();
         if (menu == 0) {
             System.out.println("프로그램 종료!!");
             break;
         }
         switch (menu) {
             case 1 : addBook();
             case 2 : box.showAllBooks(); // 등록된 모든 책 출력
             case 3 : findBook(); // 책 제목으로 검색
             case 4 : {
            	 		//변경한 책 제목을 입력받고 책 검색해서 해당 책의 주소를 받아옴
            	 //변경할 값을 입력받아서 변경
            	 //EasyTrairs.set(title)
             }
             case 5 : 
            	 // 삭제할 책의 제목을 입력받고 Bookbox에게 삭제 요청
            	 System.out.println("Delete book's title : ");
            	 String title = in.next();
            	 box.deleteBook(title);
         }
     }
     /*
     Book book = new Book("Web","Park","2022.01.23",12300);
     Book book2 = new Book();
     book2.setTitle("Java").setAuthor("Lee").setBuyDate("2023.10.11").setPrice(15400);
     book.show();
     book2.show();*/
 }
}

