package com.example.PDF.process;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

	@RestController
	@RequestMapping("/pdf")
	public class PDFController {

	    private final PDFSegmenterService segmenterService;

	    public PDFController(PDFSegmenterService segmenterService) {
	        this.segmenterService = segmenterService;
	    }

	    @PostMapping("/segment")
	    public List<String> segmentPDF(@RequestParam("file") MultipartFile file, @RequestParam("cuts") int cuts) {
	        return segmenterService.segmentPDF(file, cuts);
	    }

	    @GetMapping("/metadata/{pdfId}")
	    public PDFMetadata getMetadata(@PathVariable String pdfId) {
	        return segmenterService.getMetadata(pdfId);
	    }

	    @PutMapping("/segment/{pdfId}")
	    public void updateSegmentation(@PathVariable String pdfId, @RequestParam("cuts") int cuts) {
	        segmenterService.updateSegmentation(pdfId, cuts);
	    }

	    @DeleteMapping("/delete/{pdfId}")
	    public void deletePDF(@PathVariable String pdfId) {
	        segmenterService.deletePDF(pdfId);
	    }
	}



