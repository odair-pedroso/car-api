package unifacef.carsapi.gateways.inputs.http.requests;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import unifacef.carsapi.domains.TankStatus;
import unifacef.carsapi.domains.TypeCar;

@Data
public abstract class CarRequest implements Serializable {
	 
	private static final long serialVersionUID = -4484960512986846885L;
	
	@ApiModelProperty(position = 1)
	@NotNull(message = "{required.field}")
	private String brand;
	
	@ApiModelProperty(position = 2)
	@NotNull(message = "{required.field}")
	private String model;
	
	@ApiModelProperty(position = 3)
	@NotNull(message = "{required.field}")
	private String color;
	
	@ApiModelProperty(position = 4)
	@NotNull(message = "{required.field}")
	private String year;
	
	@ApiModelProperty(position = 5)
	@NotNull(message = "{required.field}")
	private TypeCar typeCar;
	
	@ApiModelProperty(position = 6)
	@NotNull(message = "{required.field}")
	private TankStatus tankStatus;
	
	@ApiModelProperty(position = 7)
	@NotNull(message = "{required.field}")
	private Boolean availability;

}
