package willbest.moneygot.utils;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@SuppressWarnings({"rawtypes","unchecked"})
public class DealPage<T> implements Serializable {
    private  int currentpage;
    private  int pagesize;
    private  long total;
    private  int pages;
    private List<T> list;
    private  boolean isfristpage;
    private  boolean islastpage;
    public DealPage(List<T> list){
        if(list instanceof Page){
            Page page=(Page) list;
            this.currentpage = page.getPageNum();
            this.pagesize = page.getPageSize();
            this.pages = page.getPages();
            this.list = page;
            this.total = page.getTotal();
        }else if(list instanceof Collection){
            this.currentpage = 1;
            this.pagesize = list.size();
            this.pages = 1;
            this.list = list;
            this.total = list.size();
        }
        if(list instanceof Collection){
            judgepageboudary();
        }
    }
    private  void  judgepageboudary(){
        isfristpage=currentpage==1;
        islastpage=currentpage==pages;
    }

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public boolean isIsfristpage() {
        return isfristpage;
    }

    public void setIsfristpage(boolean isfristpage) {
        this.isfristpage = isfristpage;
    }

    public boolean isIslastpage() {
        return islastpage;
    }

    public void setIslastpage(boolean islastpage) {
        this.islastpage = islastpage;
    }

    @Override
    public String toString() {
        return "DealPage{" +
                "currentpage=" + currentpage +
                ", pagesize=" + pagesize +
                ", total=" + total +
                ", pages=" + pages +
                ", list=" + list +
                ", isfristpage=" + isfristpage +
                ", islastpage=" + islastpage +
                '}';
    }
}
