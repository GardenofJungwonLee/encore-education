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
		builder.append("[��ġ ����: ");
		builder.append(storeFloor);
		builder.append(", ��� ���� �з� : ");
		builder.append(storeCategory);
		builder.append(", ���� ���� ���� : ");
		builder.append(storeContents);
		builder.append("]");
		return builder.toString();
	}
}
