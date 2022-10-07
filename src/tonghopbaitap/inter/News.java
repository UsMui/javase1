package tonghopbaitap.inter;

public class News implements INews {
    public int iD;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;
    public int[] ratedList = new int[3];

    public News() {
    }

    public News(int iD, String title, String publishDate, String author, String content, float averageRate) {
        this.iD = iD;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    @Override
    public void display() {
        System.out.println("Title: "+title+" - "+"Author: "+author+publishDate+content+averageRate);
    }
    public void Calculate(){
        float t=0;
        for(int i=0;i<ratedList.length;i++){
            t+=ratedList[i];
        }
        averageRate=t/3;
    }

}
