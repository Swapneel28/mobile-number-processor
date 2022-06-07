package no.linkmobility.mobilenumberprocessor.service;

import no.linkmobility.mobilenumberprocessor.dto.Request;
import no.linkmobility.mobilenumberprocessor.dto.Response;

public interface NumberProcessingService {

	public Response formatMobileNumber(Request request);
}
