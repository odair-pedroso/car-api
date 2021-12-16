package unifacef.carsapi.utils;

import static org.springframework.context.i18n.LocaleContextHolder.getLocale;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import unifacef.carsapi.exceptions.MessageKey;

@Component	
@RequiredArgsConstructor
public class MessageUtils {
	
	private final MessageSource messageSource;
	
	public String getMessage(final MessageKey messageKey, final Object... param) {
		return messageSource.getMessage(messageKey.getKey(), param, getLocale());
	}
	
	

}
