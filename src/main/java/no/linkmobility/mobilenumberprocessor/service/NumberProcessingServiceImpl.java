package no.linkmobility.mobilenumberprocessor.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import no.linkmobility.mobilenumberprocessor.dto.Request;
import no.linkmobility.mobilenumberprocessor.dto.Response;
import no.linkmobility.mobilenumberprocessor.util.FormatterUtil;
import no.linkmobility.mobilenumberprocessor.util.ValidationUtil;


@Service
public class NumberProcessingServiceImpl implements NumberProcessingService {
	
	public static final String INVALID_NUMBER = new String("invalid");
    //public static final String PATTERN = "0{2}?\\+?4?6?[\\s-][0-9]";

	@Override
	public Response formatMobileNumber(Request request) {
		Response response= new Response();
		List<String> numbers = request.getNumbers();
		List<String> formattedNumbers = new ArrayList<>();
		Optional.ofNullable(numbers).orElse(Collections.emptyList()).stream().forEach(number -> {
			number = number.trim();
			if(ValidationUtil.isValid(number)) {
			   formattedNumbers.add(FormatterUtil.format(number));
			} else {
			   formattedNumbers.add(INVALID_NUMBER);	
			}
		});
		response.setNumbers(formattedNumbers);
		return response;
	}
	
}