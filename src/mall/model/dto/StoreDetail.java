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
	      builder.append("[����� : ");
	      builder.append(StartMonth);
	      builder.append(", ������ : ");
	      builder.append(UsingArea);
	      builder.append("��, ������ : ");
	      builder.append(Deposit);
	      builder.append("��, ������ : ");
	      builder.append(RentFee);
	      builder.append("��]");
	      return builder.toString();
	}
}
