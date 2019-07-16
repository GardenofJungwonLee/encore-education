package mall.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreDetail {
	private String StartMonth;
	   private int UsingArea;
	   private int Deposit;
	   private int RentFee;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
	      builder.append("[계약년월 : ");
	      builder.append(StartMonth);
	      builder.append(", 사용면적 : ");
	      builder.append(UsingArea);
	      builder.append("평, 보증금 : ");
	      builder.append(Deposit);
	      builder.append("원, 임차료 : ");
	      builder.append(RentFee);
	      builder.append("원]");
	      return builder.toString();
	}
}
