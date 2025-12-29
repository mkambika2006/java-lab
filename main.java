import java.util.Scanner;
class Book{
    private String name;;
    private String author;
    private double price;
    private int num_page;

    Book(String name,String author,double price,int num_page){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_page=num_page;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setNum_Page(int num_page){
        this.num_page=num_page;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getNum_Page(){
        return num_page;
    }

    public String toString(){
        return "\nBook Details:\n"+"Name:"+name+"\n"+"author:"+author+"\n"+"price:"+price+"\n"+"Pages:"+num_page+"\n";
    }
}
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of book:");
        int n=sc.nextInt();
        sc.nextLine();
        Book[] book=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Details of book"+(i+1) +":");
            System.out.println("Enter the book name:");
            String name=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the author name: ");
            String author=sc.nextLine();
            System.out.println("Enter the price of the book: ");
            double price=sc.nextInt();
            System.out.println("Enter the num_pages:");
            int num_page=sc.nextInt();
        book[i]=new Book(name,author,price,num_page);
        }
        for(Book b:book){
        System.out.println(b);
        }
    }
}

