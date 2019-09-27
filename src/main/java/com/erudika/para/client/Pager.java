package com.erudika.para.client;

/**
 * 
 * @author qhuynh
 * Same as: com/erudika/para/utils/Pager.java
 */
public class Pager {
    private long page;
    private long count;
    private String sortby;
    private boolean desc;
    private int limit;
    private String name;
    private String lastKey;

	public Pager(int int1, int maxItemsPerPage) {
		// TODO Auto-generated constructor stub
	}
	
	public Pager() { }

	public Pager(int i) {
		// TODO Auto-generated constructor stub
	}

	public Pager(long l, int limit2) {
		// TODO Auto-generated constructor stub
	}

	public Pager(int i, String string, boolean b, int j) {
		// TODO Auto-generated constructor stub
	}

	public long getPage() {
		return page;
	}

	public void setPage(long page) {
		this.page = page;
	}

	public String getSortby() {
		return sortby;
	}

	public void setSortby(String sortby) {
		this.sortby = sortby;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastKey() {
		return lastKey;
	}

	public void setLastKey(String lastKey) {
		this.lastKey = lastKey;
	}

	public boolean isDesc() {
		return desc;
	}

	public long getCount() { return 0; }

	public void setDesc(boolean b) {
		// TODO Auto-generated method stub
		
	}
    /**
     * Set the value of count.
     * @param count total count
     */
    public void setCount(long count) {
            this.count = count;
    }

}
