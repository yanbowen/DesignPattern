package OpenClosePrinciple;

/**
 * Created by yanbowen on 1/2/2017.
 */
public class NovelBook implements IBook {
    //书籍名称
    private String name;
    //书籍价格
    private int price;
    //书籍作者
    private String author;

    NovelBook(String _name, int _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
