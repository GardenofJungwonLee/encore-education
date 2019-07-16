package mall.model.dto;

import lombok.Data;

@Data
public class StoreInfo {
	private String storeFloor;
	private String storeCategory;
	private String storeContents;
	
	public StoreInfo() {
	}
	public StoreInfo(String storeFloor, String storeCategory, String storeContents) {
		this.storeFloor = storeFloor;
		this.storeCategory = storeCategory;
		this.storeContents = storeContents;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[위치 층수: ");
		builder.append(storeFloor);
		builder.append(", 기업 업종 분류 : ");
		builder.append(storeCategory);
		builder.append(", 제공 서비스 내용 : ");
		builder.append(storeContents);
		builder.append("]");
		return builder.toString();
	}
}
