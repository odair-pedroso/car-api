package unifacef.carsapi.gateways.inputs.http.responses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ErrorResponse implements Serializable {	
	private static final long serialVersionUID = -3941434646549309532L;
	
	private List<String> errors = new ArrayList();

}
