package app.model;

/*model类
* 一般来说，一个model类对应一个数据库表*/
public class ExampleModel {
    private String col_1;
    private String col_2;

    public String getCol_1() {
        return col_1;
    }

    public void setCol_1(String col_1) {
        this.col_1 = col_1;
    }

    public String getCol_2() {
        return col_2;
    }

    public void setCol_2(String col_2) {
        this.col_2 = col_2;
    }
}
