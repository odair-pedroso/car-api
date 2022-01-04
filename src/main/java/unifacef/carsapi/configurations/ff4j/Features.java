package unifacef.carsapi.configurations.ff4j;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter	
@RequiredArgsConstructor
public enum Features {
	
	SEND_TO_LOCATION(
		"send-to-rental",
		"features",
		"Envia o carro cadastrado para a Rental",
		true);
		
	private final String key;
	private final String groupName;
	private final String description;
	private final boolean defaultValue;	
		

}
