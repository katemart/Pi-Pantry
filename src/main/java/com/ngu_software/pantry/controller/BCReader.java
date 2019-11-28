package com.ngu_software.pantry.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Barcode implementation (optional)
 * @author Jimmy Nguyen
 * @since 2019-Nov-27 7:34:42 PM
 */

public class BCReader {
	
	//https://dzone.com/articles/java-barcode-api
	
	private static void read() {
		InputStream barCodeInputStream;
		try {
			barCodeInputStream = new FileInputStream("file.jpg");
			BufferedImage barCodeBufferedImage = ImageIO.read(barCodeInputStream);

			LuminanceSource source = new BufferedImageLuminanceSource(barCodeBufferedImage);
			BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
			Reader reader = new MultiFormatReader();
			Result result = reader.decode(bitmap);
			
			System.out.println("Barcode text is " + result.getText());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotFoundException e) {
			e.printStackTrace();
		} catch (ChecksumException e) {
			e.printStackTrace();
		} catch (FormatException e) {
			e.printStackTrace();
		}
	}
	
	private static void write() {
		String text = "98376373783"; // this is the text that we want to encode

		int width = 400;
		int height = 300; // change the height and width as per your requirement

		// (ImageIO.getWriterFormatNames() returns a list of supported formats)
		String imageFormat = "png"; // could be "gif", "tiff", "jpeg" 

		BitMatrix bitMatrix;
		try {
			bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
			MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, new FileOutputStream(new File("qrcode_97802017507991.png")));
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
