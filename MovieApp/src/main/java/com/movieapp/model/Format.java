package com.movieapp.model;

public enum Format {

	TWOD("2D"),
	THREED("3D"),
	TWODS("2D SCREEN"),
	THREEDS("3D SCREEN"),
	TWODMAX("IMAX 2D"),
	THREEDMAX("IMAX 3D"),
	THREEDICE("ICE 3D");
	
	private String format;
	
	private Format(String format) {
		this.format = format;
	}

	public String getFormat() {
		return format;
	}
	
	
	
}
