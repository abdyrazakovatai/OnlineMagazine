public class Book extends Product{
    private String authorFullName;

    public Book(){

    }
    public Book(String authorFullName){
        this.authorFullName = authorFullName;
    }
    public String getAuthor(){
        return authorFullName;
    }
}
