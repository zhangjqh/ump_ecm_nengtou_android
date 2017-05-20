package wa.android.common.vo;

public class ServiceCodeResVO {
	private String serviceCode;
	private String productId;
	
	@Override
	public boolean equals(Object o) {
		if(o == null) 
			return false;
		if(this == o)
			return true;
		if(o instanceof ServiceCodeResVO) {
			return this.serviceCode.equals(((ServiceCodeResVO) o).getServiceCode()) && this.productId.equals(((ServiceCodeResVO) o).getProductId());
		}
		return false;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}	
}
