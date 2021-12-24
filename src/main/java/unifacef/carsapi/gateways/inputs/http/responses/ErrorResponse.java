package unifacef.carsapi.gateways.inputs.http.responses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_EMPTY)
@Data
public class ErrorResponse implements Serializable {	
	private static final long serialVersionUID = -3941434646549309532L;
	
	private List<String> errors = new ArrayList();

}
