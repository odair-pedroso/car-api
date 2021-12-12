package unifacef.carsapi.gateways.inputs.http.responses;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CarResponse implements Serializable {
	 
	private static final long serialVersionUID = 7720638133263136151L;
	
	@ApiModelProperty(position=0)
	private String board;
	
	@ApiModelProperty(position=1)
	private String brand;

}
