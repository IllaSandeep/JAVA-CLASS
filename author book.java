import java.util.Scanner;
class author 
{
    String name="sandep";
    /*public readName()
    {
       name= sc.nextLine();   
    }*/
    public void name()
    {
        System.out.println("Authot name is :-"+name);
    }
    String email="sandeep@123gmail.com";
    /*public readEmail()
    {
        email=sc.nextLine();
    }*/
    public void email()
    {
        System.out.println("Author email is:-"+email);
    }
    char gender='M';
    /*public readgender()
    {
        gender=sc.nextLine.charAt(0);
    }*/
    public void gender()
    {
        System.out.println("Author gender is :- "+gender);
    }
}
class book  extends author
{
    String bookname="harry potter";
    /*public readbookname()
    {
        bookname=sc.nextLine();
    }*/
    public void bookName()
    {
        System.out.println("book name is :-"+bookname);
    }
    double price=999.999;
    /*public readprice()
    {
        price=sc.nextDouble();
    }*/
    public void price()
    {
        System.out.println("Book price is :-"+price);
    }
    int qnty=122;
    /*public readqnty()
    {
        qnty=sc.nextInt();
    }*/
    public void quantity()
    {
        System.out.println("Books quantity is :-"+qnty);
    }
}
class Origin
{
    public static void main(String args[])
    {
        book b=new book();
        b.name();
        b.email();
        b.gender();
        b.bookName();
        b.price();
        b.quantity();
    }
}
