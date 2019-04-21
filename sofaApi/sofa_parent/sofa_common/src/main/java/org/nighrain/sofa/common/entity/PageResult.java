package org.nighrain.sofa.common.entity;

import java.util.List;

/**
 *    
 * Title         [分页结果集]
 * Author:       [nighrain]
 * CreateDate:   [2019-04-21--21:02]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [..]
 * <p></p>
 *  
 */
public class PageResult<T> {
    private Long total;             //总数
    private Integer totalPages;     //总页数
    private Integer currentPages;   //当前页
    private Integer ratedSize;      //每页大小
    private List<T> rows;           //结果集

    public PageResult() {
    }

    public PageResult(Long total, Integer totalPages, Integer currentPages, List<T> rows) {
        this.total = total;
        this.totalPages = totalPages;
        this.currentPages = currentPages;
        this.rows = rows;
    }

    public PageResult(Long total, Integer totalPages, Integer currentPages, Integer ratedSize, List<T> rows) {
        this.total = total;
        this.totalPages = totalPages;
        this.currentPages = currentPages;
        this.ratedSize = ratedSize;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getCurrentPages() {
        return currentPages;
    }

    public void setCurrentPages(Integer currentPages) {
        this.currentPages = currentPages;
    }

    public Integer getRatedSize() {
        return ratedSize;
    }

    public void setRatedSize(Integer ratedSize) {
        this.ratedSize = ratedSize;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
