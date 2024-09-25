package com.example.PDF.process;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.io.File;
import java.io.IOException;
import java.util.List;

	public class PDFSegmenter {

	    public List<Float> getWhitespaceGaps(PDDocument document) throws IOException {
			return null;
			
	        // Use PDFTextStripper to extract text and positions
	        // Sort the text blocks based on Y-axis position
	        // Calculate vertical gaps between consecutive blocks
	        // Return the gaps
	    }
	}



