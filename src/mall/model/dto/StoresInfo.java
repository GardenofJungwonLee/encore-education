package mall.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class StoresInfo {
	
	private String StoreName;
	private StoreInfo StoreInfo;
	private StoreDetail StoreDetail; 
	
	public StoresInfo() {
	}
	
	public StoresInfo(String StoreName, StoreInfo StoreInfo, StoreDetail StoreDetail) {
		this.StoreName = StoreName;
		this.StoreInfo = StoreInfo;
		this.StoreDetail = StoreDetail;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ��������� : ");
		builder.append(StoreName);
		builder.append("\n2. ������� �⺻���� : ");
		builder.append(StoreInfo);
		builder.append("\n3. ������� �󼼳���: ");
		builder.append(StoreDetail);
		return builder.toString(); 
	}
}
