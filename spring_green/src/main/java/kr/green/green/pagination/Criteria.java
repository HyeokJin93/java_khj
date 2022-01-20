package kr.green.green.pagination;

import lombok.Data;

@Data
public class Criteria {
	private int page; 
	private int perPageNum;
	private String type;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 5;
		this.type="일반";
	}
	public Criteria(int page, int perPageNum) {
		this.page = page <= 0 ? 1 : page;
		this.perPageNum = perPageNum <= 0 ? 5 : perPageNum;
	}
	/* 쿼리문에서 limit에 사용되는 인덱스를 계산하는 getter
	 * limit 번지, 갯수로 쿼리를 작성해야하는데
	 * 갯수는 알지만 번지는 page와 perPageNum을 계산해서 구해야 한다.
	 * getPageStart가 page와 perPageNum을 이용해서 번지를 계산해서 알려주는
	 * getter */
	public int getPageStart() {
		return (this.page -1) * perPageNum;
	}
	
}
