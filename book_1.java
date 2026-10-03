public class book_1{
    // create book with constructor and set / get methods , create 5 objects using an array and display details 
   static class book{
        String author ;
        String title ;
        int price ;
        // constructor 
        book(String author , String title  , int price ){
            this.title = title ;
            this.author = author ; 
            this.price = price ;
        }
        // setters and getters
        void setPrice(int price){ 
            this.price = price;
        }
        String getTitle(){
            return title;
        }
        String getAuthor(){
            return author;
        }
        int getPrice(){
            return price;
        }
        void display(){
            System.out.println("author : " + author + "title : " + title + "price : " + price);
        }


    }
    public static void main(String[] args) {
        book[] books = new book[5];
        books[0] = new book("anu " , "yo " , 34);
        books[1] = new book("anup " , "yoo " , 39);
        books[2] = new book("anupr " , "yooo " ,9034);
        books[3] = new book("anupri " , "yoooo " , 342);
        books[4] = new book("anupriya " , "yoooo " , 3344);

        for(book b : books) b.display();

    }
}
