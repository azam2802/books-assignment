public class EBook extends Book{
    private double filesizeMB;
    private String fileFormat;
    private int pricepermb=100;
    public EBook(String title, String author, int yearPublished, double filesizeMB, String fileFormat){
        super(title,author,yearPublished);
        this.filesizeMB=filesizeMB;
        this.fileFormat=fileFormat;
    }
    public EBook(String title, String author, int yearPublished, double filesizeMB){
        super(title,author,yearPublished);
        this.filesizeMB=filesizeMB;
    }
    @Override public String getBookInfo(){
        return getTitle()+","+getAuthor()+","+getYearPublished()+","+filesizeMB+","+fileFormat+",PrintedBook";
    }
    @Override public void printBookDetails(){
        System.out.println("EBook info: \nTitle: "+getTitle()+"\nAuthor: "+getAuthor()+"\nYear Published: "+getYearPublished()+"\nFile Size: "+filesizeMB+" MB\nFile Format: "+fileFormat+"\nBook Type: EBook\n");
    }
    public void bookType(){
        System.out.println("This is an ebook");
    }
    public double bookPrice(){
        if("PDF".equals(fileFormat)){
            return pricepermb*filesizeMB*1.5;
        } else if("MOBI".equals(fileFormat)){
            return pricepermb*filesizeMB*2;
        } else {
            return pricepermb*filesizeMB;
        }
    }
    public double getFilesizeMB(){return filesizeMB;}
    public String getFileFormat(){return fileFormat;}
    public int getPricepermb(){return pricepermb;}
}
