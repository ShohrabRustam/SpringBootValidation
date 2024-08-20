package com.example.Curl.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurlService {

    private static final String url = "https://stg-api.mpokket.app/payeename/v1/validate";

    @Autowired
    private RestTemplate restTemplate;

    public String payeeValidation(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic ZGV2YXBpOjBCd1hac3cybHljeXhLaHhPNzlr");
        headers.set("Content-Type", "application/json");
        String jsonPayload = """
            {
                "validation": "bank_validation",
                "data": [
                    {
                        "user_id": "10031052",
                        "user_entered_name": "SHANKAR",
                        "beneficiary_name": "SHANKAR",
                        "beneficiary_mobile_number": "9126314136",
                        "account_number": "918917699914",
                        "ifsccode": "SBIN0006028",
                        "kyc_name": "",
                        "pan_name": "SADIKUL HUSSAIN",
                        "manual_request": "YES"
                    }
                ]
            }
        """;

        HttpEntity<String> entity = new HttpEntity<>(jsonPayload, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                entity,
                String.class
        );

        return response.getBody();
    }
}
