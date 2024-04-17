package EasyTrairs;

public class EasyTrairs {
    private String title, author, buyDate;
    private int price;
    // 메소드 중복정의(method overloading)
    public EasyTrairs(String title, String author, String buyDate, int price) {
        this.title = title;
        this.author = author;
        this.buyDate = buyDate;
        this.price = price;
    }
    // 기본생성자
    public EasyTrairs() {}
    public EasyTrairs(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public boolean equalTitle(String title) {
    	return (this.title.equals(title))? true : false;
    }
    public EasyTrairs setTitle(String title) {
        this.title = title;
        return this;   // Method Chaining
    }
    public String getAuthor() {
        return author;
    }
    public EasyTrairs setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getBuyDate() {
        return buyDate;
    }
    public EasyTrairs setBuyDate(String buyDate) {
        this.buyDate = buyDate;
        return this;
    }
    public int getPrice() {
        return price;
    }
    public EasyTrairs setPrice(int price) {
        this.price = price;
        return this;
    }
    public void show() {
        System.out.println("**" + title);
        System.out.println("  " + author);
        System.out.println("  " + buyDate);
        System.out.println("  " + price);
    }
}













/*public class EasyTrairs {
	
	private String title, author, buyDate;
	private int price;
	
	//메소드 중복 정의(method overloading)
	public EasyTrairs(String title, String author, String buyDate, int price) {
		this.title = title;
		this.author = author;
		this.buyDate = buyDate;
		this.price = price;
	}
	
	//기본 생성자
	public EasyTrairs() {}
	
	public EasyTrairs setTitle(String title) {
		this.title = title;
		return this;
	}
	public void getTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}

	public EasyTrairs setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public EasyTrairs setBuyDate(String buyDate) {
		this.buyDate = buyDate;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public EasyTrairs setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public void show() {
		System.out.println("**" + title);
		System.out.println(" " + author);
		System.out.println(" " + buyDate);
		System.out.println(" " + price);
	}
}
*/