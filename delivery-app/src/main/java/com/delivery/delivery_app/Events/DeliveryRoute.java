package com.delivery.delivery_app.Events;

import java.util.List;

public class DeliveryRoute {

	private static final List<double[]> route = List.of(
		new double[]{44.4829, 26.1039},
		new double[]{44.4832, 26.1045},
		new double[]{44.4847, 26.1063},
		new double[]{44.4858, 26.1072},
		new double[]{44.4870, 26.1080}
	);
	
	private int i = 0;
	
	public double[] nextLoc() {
		
		if(i >= route.size()) {
			i = route.size() - 1;
		}
	
		return route.get(i++);
	}
}
