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
		builder.append("1. 입점기업명 : ");
		builder.append(StoreName);
		builder.append("\n2. 입점기업 기본내용 : ");
		builder.append(StoreInfo);
		builder.append("\n3. 입점기업 상세내용: ");
		builder.append(StoreDetail);
		return builder.toString(); 
	}
}
