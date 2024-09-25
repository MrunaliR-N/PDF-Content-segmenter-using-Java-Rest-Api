package com.example.PDF.process;


	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.web.client.TestRestTemplate;
	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;

	@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
	class PDFControllerTest {

	    @Autowired
	    private TestRestTemplate restTemplate;

	    @Test
	    void testSegmentPDFEndpoint() {
	        // Test the POST /segment-pdf endpoint.
	    }
	}



