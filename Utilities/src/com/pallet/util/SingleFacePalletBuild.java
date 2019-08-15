package com.pallet.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import com.obj.pallet.PalletObject;

public class SingleFacePalletBuild {
	
	public static void main(String argv[]) {
		buildFacePallet(0.2600,0.2600,0.2800,1,1.2,1.1,27.6);
	}
	
	private static void buildFacePallet(double cartonW, double cartonL, double cartonH, 
			double palletW, double palletL, double palletH, double cartonWg) {
		
		DecimalFormat df = new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.CEILING);
		
		//create pallet object
		PalletObject pallet = new PalletObject();
		pallet.setWidth(palletW);
		pallet.setLength(palletL);
		pallet.setHeight(palletH);
		
		// First Pass - Pallet width / Carton width and Pallet length / carton length
		double x1 = Double.parseDouble(df.format(palletW / cartonW));
		double y1 = Double.parseDouble(df.format(palletL / cartonL));		
		int layer1 = (int) Math.round(x1 * y1);
		
		pallet.setLayer1(layer1);
		
		// Second Pass - pallet length / caton width and pallet width / carton length
		double x2 = Double.parseDouble(df.format(palletL / cartonW));
		double y2 = Double.parseDouble(df.format(palletW / cartonL));
		int layer2 = (int) Math.round(x2 * y2);
		
		pallet.setLayer2(layer2);
		
		// Which of the two passes yields the maximum quantity or cartons per layer
		int maxQuantity = Math.max(layer1, layer2);
		pallet.setMaxQnty(maxQuantity);
		
		// Set the width and length based on the returned previous quantities
		if (layer1 > layer2) {
			pallet.setCartonsWide(x1);
			pallet.setCartonsLength(y1);
		} else {
			pallet.setCartonsWide(x2);
			pallet.setCartonsLength(y2);
		}
		
		int maxLayers = (int) Math.round(palletH / cartonH);
		pallet.setMaximumLayers(maxLayers);
		pallet.setTotalCartonQnty(maxQuantity * maxLayers);
		pallet.setTotalHeight(Double.parseDouble(df.format(maxLayers * cartonH)));
		pallet.setTotalWeight(Double.parseDouble(df.format(cartonWg * pallet.getTotalCartonQnty())));
		
		
		System.out.println("CL : " + pallet.getCartonsLength());
		System.out.println("CW : " + pallet.getCartonsWide());
		System.out.println("CH : " + pallet.getHeight());
		System.out.println("TL : " + pallet.getLength());
		System.out.println("MaxL : " + pallet.getMaximumLayers());
		System.out.println("MaxQ : " + pallet.getMaxQnty());
		System.out.println("TCQnty : " + pallet.getTotalCartonQnty());
		System.out.println("TH : " + pallet.getTotalHeight());
		System.out.println("TWg : " + pallet.getTotalWeight());
	}
}


